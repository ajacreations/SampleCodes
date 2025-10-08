function quickSort(arr) {
    if (arr.length <= 1) return arr;

    let pivot = arr[Math.floor(arr.length / 2)];
    let left = arr.filter(x => x < pivot);
    let middle = arr.filter(x => x === pivot);
    let right = arr.filter(x => x > pivot);

    return [...quickSort(left), ...middle, ...quickSort(right)];
}

// Example
console.log(quickSort([10, 7, 8, 9, 1, 5]));
// Output: [1, 5, 7, 8, 9, 10]
