# A-Levels
Backup of all CSMtest assignments given by Mr. Rahman. Dating from September 2021 to May 2023.
Started documenting on 17 April 2023. A lot of year 12 (Sept 21 - June 22) is either deleted or hidden from me. 
Some code is accessed from school and not from csmtest.co.uk.
Planning to transfer all code eventually on a weekly basis. 


19 Computational thinking and problem-solving

19.1 Algorithms

Linear Search:

Set index i to 0
Repeat until the ith element is the desired element or i is greater than the length of the array:
a. If the ith element is the desired element, return i
b. Increment i
If the desired element was not found, return -1
Binary Search:

Set the lower bound to the first index of the array
Set the upper bound to the last index of the array
Repeat until the lower bound is greater than the upper bound:
a. Set the middle index to be the floor of the average of the lower and upper bounds
b. If the middle element is the desired element, return the middle index
c. If the middle element is less than the desired element, set the lower bound to be the middle index + 1
d. If the middle element is greater than the desired element, set the upper bound to be the middle index - 1
If the desired element was not found, return -1
Insertion Sort:

For each element in the array starting from the second element:
a. Set the current element as the key
b. Set j to be one index less than the current index
c. While j is greater than or equal to 0 and the element at j is greater than the key:
i. Shift the element at j to the right
ii. Decrement j
d. Insert the key into the correct position in the sorted subarray
Bubble Sort:

Repeat until no swaps occur in one pass:
a. For each element in the array starting from the first element:
i. If the current element is greater than the next element:
1. Swap the two elements
2. Set a flag to indicate that a swap occurred
b. If no swaps occurred in the pass, the array is sorted
Linked List Search:

Set the current node to be the head of the list
Repeat until the current node is null or the desired element is found:
a. If the current node contains the desired element, return the node
b. Set the current node to be the next node in the list
If the desired element was not found, return null
Linked List Insertion:

Create a new node with the desired element
Set the next pointer of the new node to be the current head of the list
Set the head of the list to be the new node
Binary Tree Search:

Set the current node to be the root of the tree
Repeat until the current node is null or the desired element is found:
a. If the current node contains the desired element, return the node
b. If the desired element is less than the current node's element, set the current node to be the left child
c. If the desired element is greater than the current node's element, set the current node to be the right child
If the desired element was not found, return null
Binary Tree Insertion:

If the tree is empty, create a new root node with the desired element
Set the current node to be the root of the tree
Repeat until a leaf node is reached:
a. If the desired element is less than the current node's element and the left child is null, create a new left child node with the desired element and return
b. If the desired element is greater than the current node's element and the right child is null, create a new
