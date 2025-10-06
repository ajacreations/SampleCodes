/*
 Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), 
and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author 
details)
*/

class Author
{
	private String name,email;
	private char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	String getAuthorName()
	{
		return name;
	}
	char getGender()
	{
		return gender;
	}
	String getEmail()
	{
		return email;
	}
}
class Book
{
	String name;
	Author author;
	double price;
	int qtyInStock;
	Book(String name,double price,int qtyInStock,Author author)
	{
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		this.author=author;
	}
	Author getAuthor()
	{
		return author;
	}
	String getName()
	{
		return name;
	}
	double getPrice()
	{
		return price;
	}
	int getQty()
	{
		return qtyInStock;
	}
	void showDetails()
	{
		System.out.println("Book Details");
		System.out.println("------------");
		System.out.println("Book Name: "+getName());
		System.out.println("Author Name: "+getAuthor().getAuthorName());
		System.out.println("Author Details: "+getAuthor().getEmail()+"\tGender: "+getAuthor().getGender());
		System.out.println("Price: "+getPrice());
		System.out.println("Quantity in Stock:"+getQty());	
		System.out.println("--------------------------------------\n");
	}
	public static void main(String[] args) 
	{
		Author author=new Author("Chethan Bhagat","chethan@gmail.com",'m');
		Book b=new Book("Five Point Someone",175,10,author);
		b.showDetails();
		Author author2=new Author("George R.R. Martin","grrm@gmail.com",'m');
		Book b2=new Book("Clash of Kings",1400,5,author2);
		b2.showDetails();
	}
}