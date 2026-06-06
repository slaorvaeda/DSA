# Linked List: Structure and Diagrams

## Introduction
A **Linked List** is a linear data structure where elements are stored in nodes, and each node points to the next node through a pointer/reference. Unlike arrays, linked lists don't require contiguous memory locations.

---

## Structure of a Linked List

### Node Structure
Each node in a linked list contains two main components:

```
┌─────────────┬─────────┐
│    Data     │  Next   │
└─────────────┴─────────┘
     (value)   (pointer)
```

- **Data**: Stores the actual value or information
- **Next**: A pointer/reference to the next node in the list (or `null` if it's the last node)

---

## Basic Linked List Diagram

### Empty Linked List
```
Head → null
```

### Single Node
```
Head → [Data | Next→null]
```

### Multiple Nodes
```
Head → [10 | •] → [20 | •] → [30 | •] → [null]
         ↑         ↑         ↑
       Node1     Node2     Node3
```

### Visual Representation
```
┌──────────────────────────────────────────────────────┐
│ Linked List with 4 nodes                             │
└──────────────────────────────────────────────────────┘

Head
  │
  ▼
┌────────────────┐      ┌────────────────┐      ┌────────────────┐      ┌────────────────┐
│   10   | ───┐  │      │   20   | ───┐  │      │   30   | ───┐  │      │   40   | null  │
└────────────────┘      └────────────────┘      └────────────────┘      └────────────────┘
   Node 0                  Node 1                  Node 2                  Node 3
```

---

## Types of Linked Lists

### 1. **Singly Linked List**
Each node points to the next node only.
```
Head → [A | •] → [B | •] → [C | •] → [null]
```

### 2. **Doubly Linked List**
Each node has two pointers: one to the next node and one to the previous node.
```
null ← [A | • ← → • | B] ← → [B | • ← → • | C] ← → [C | • ← → • | null]
```

Diagram:
```
        ┌──────────────────────────────────────────┐
        │                                          │
        ▼                                          ▼
Head ← [• | A | •] ← → [• | B | •] ← → [• | C | •] → null
    prev data next   prev data next   prev data next
```

### 3. **Circular Linked List**
The last node points back to the first node.
```
Head → [A | •] → [B | •] → [C | •] ──┐
  ▲                                    │
  └────────────────────────────────────┘
```

---

## Key Operations

| Operation | Description | Time Complexity |
|-----------|-------------|-----------------|
| Insert at Head | Add element at beginning | O(1) |
| Insert at Tail | Add element at end | O(n) |
| Delete from Head | Remove first element | O(1) |
| Delete from Tail | Remove last element | O(n) |
| Search | Find an element | O(n) |
| Traverse | Visit all nodes | O(n) |

---

## Advantages & Disadvantages

### ✅ Advantages
- **Dynamic Size**: Can grow and shrink dynamically
- **Efficient Insertions/Deletions**: O(1) at the beginning
- **Memory Efficient**: Uses only required memory
- **No Pre-allocation**: Memory allocated as needed

### ❌ Disadvantages
- **No Random Access**: Must traverse from head to access elements
- **Extra Memory**: Requires extra space for pointers
- **Slower Access**: Cannot access elements by index like arrays
- **Cache Inefficiency**: Nodes scattered in memory

---

## Memory Representation

### Array (Random Access)
```
Index:  0    1    2    3    4
      ┌────┬────┬────┬────┬────┐
      │ 10 │ 20 │ 30 │ 40 │ 50 │
      └────┴────┴────┴────┴────┘
      Memory: Contiguous
```

### Linked List (Sequential Access)
```
Memory Address:  1000        2500        5000        7800
                  │            │          │           │
              ┌────────┐    ┌────────┐  ┌────────┐  ┌────────┐
Head ─────→  │ 10 │2500│─→│ 20 │5000│─→│ 30 │7800│─→│ 40 │null │
              └────────┘    └────────┘  └────────┘  └────────┘
              Memory: Non-contiguous
```

---

## Example: Creating a Linked List

```java
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    LinkedList() {
        head = null;
    }
}

// Creating: 1 → 2 → 3 → null
LinkedList list = new LinkedList();
list.head = new Node(1);
list.head.next = new Node(2);
list.head.next.next = new Node(3);
```

---

## Common Linked List Operations Code Snippets

### Insertion at Beginning
```
newNode.next = head;
head = newNode;
```

### Deletion from Beginning
```
head = head.next;
```

### Traversal
```
while (current != null) {
    process(current.data);
    current = current.next;
}
```

---

**Note**: Practice implementing these operations to master linked lists!
