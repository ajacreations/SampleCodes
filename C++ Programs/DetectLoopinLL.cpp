#include <iostream>
#include <unordered_set>
using namespace std;

struct Node
{
    int data;
    struct Node *next;
};

void push(struct Node **head, int item)
{
    struct Node *new_node = new Node;
    new_node->data = item;
    new_node->next = (*head);
    (*head) = new_node;
}

bool detect_loop(struct Node *h)
{
    unordered_set<Node *> s;
    while (h != NULL)
    {
        if (s.find(h) != s.end())
            return true;
        s.insert(h);
        h = h->next;
    }
    return false;
}

int main()
{
    struct Node *head = NULL;
    push(&head, 20);
    push(&head, 4);
    push(&head, 15);
    push(&head, 10);

    // head->next->next->next->next = head;

    if (detect_loop(head))
        cout << "Yes!Loop found ";
    else
        cout << "No";
    return 0;
}