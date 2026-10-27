/*#include<iostream>
#include<math.h>
#include<queue>
using namespace std;
 
void swap(int& first, int& second)
{
    int temp = first;
    first = second;
    second = temp;
}
 
int partition(int* A, int l, int h)
{
    int pivot = A[h];
 
    int i = (l - 1);  // Index of smaller element
 
    for (int j = l; j <= h - 1; j++)
    {
        // If current element is smaller than the pivot
        if (A[j] < pivot)
        {
            i++;    // increment index of smaller element
            swap(A[i], A[j]);
        }
    }
    swap(A[i + 1], A[h]);
    return (i + 1);
}
 
void QuickSort(int* arr, int l, int h)
{
    if (l < h)
    {
        int j=0;
        j = partition(arr, l, h);
        QuickSort(arr, l, j-1);
        QuickSort(arr, j + 1, h);
    }
}
 
void Merge(int* arr, int l, int h)
{
        int b[50] ;
        int mid = (l + h) / 2;
        int i=l, j = mid+1;
        int k = l;
        while (i <= mid && j <= h)
        {
            if (arr[i] > arr[j])
            {
                b[k++] = arr[i++];
            }
            else
            {
                b[k++] = arr[j++];
            }
        }
        while (i <= mid)
        {
            b[k++] = arr[i++];
        }
        while (j <= h)
        {
            b[k++] = arr[j++];
        }
        for (int i = l; i < k; i++)
        {
            arr[i] = b[i];
        }
}
 
 
void MergeSort(int *arr , int l , int h)
{
    if (l < h)
    {
        int mid = (l + h) / 2;
        MergeSort(arr, l, mid);
        MergeSort(arr, mid + 1, h);
        Merge(arr, l, h);
    }
 
}
 
void CountSort(int* arr, int size)
{
    int max = arr[0];
    for (int i = 0; i <= size; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    int tsize = max + 1;
    int *temp = new int [tsize];
    for (int i = 0; i <tsize; i++)
    {
        temp[i] = 0;
    }
    for (int i = 0; i <=size; i++)
    {
        temp[arr[i]]+=1;
    }
    int j = 0;
    int i = 0;
    while (i<tsize)
    {
        if (temp[i] > 0)
        {
            arr[j++] = i;
            temp[i]--;
        }
        else
        {
            i++;
        }
    }
 
}
 
 
void RadixSort(int* arr, int n)
{
    int max = arr[0];
    int temp;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    int cnt=0;
    while (max != 0)
    {
        max = max / 10;
        cnt++;
    }
    int k=0;
    vector<queue<int>>q(10);
    for (int i = 0; i < cnt; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (arr[j] / pow(10, i) > 0)
            {
                temp = (arr[j] / int(((pow(10, i)))) % 10);
            }
            else
            {
                temp = 0;
            }
            q[temp].emplace(arr[j]);
        }
        k = 0;
        for (int j = 0; j < q.size(); j++)
        {
            while (!(q[j].empty()))
            {
                arr[k++] = q[j].front();
                q[j].pop();
            }
        }
    }
 
}
 
 
int main()
{
    int arr[] = { -43,-5,-56,-4,-23,-4,-667,-68,-43,-543,-6,-75,-4,-3,-42,-1,-24,-3,-546,-546,-546,-45,-6,-75,-87,-876 };
    MergeSort(arr,0, 24);
    for (int i = 0; i < 24; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    cout << arr[0] * arr[1] * arr[3] << " ";
    cout << endl;
 
}
 
 
#include<iostream>
#include<vector>
using namespace std;
 
template<typename T>
class Stack
{
    int top;
    int size;
    T* arr;
public:
    Stack(int s)
    {
        top = -1;
        size = s;
        arr = new T[size];
    }
    bool isEmpty()
    {
        if (top == -1)
            return true;
        return false;
    }
    bool isFull()
    {
        if (top == size - 1)
            return true;
        return false;
    }
    void push(T d)
    {
        if (!isFull())
        {
            arr[++top] = d;
        }
    }
    T pop()
    {
        if (!isEmpty())
        {
            return arr[top--];
        }
    }
    T peek()
    {
        T x;
        x.first = -1;
        x.second = -1;
        if(!isEmpty())
        {
            x = arr[top];
        }
        return x;
    }
};
 
template<typename T , typename S>
class Pair
{
public:
    T first;
    S second;
 
 
};
 
int main()
{
    vector<Pair<int, int>>Sets;
    //Set of Intervals = {(2,4), (3,7), (8,12), (10,15), (17, 18)}
    //Merges set of non - overlapping intervals = { (2,7), (8,15), (17,18) }
    Sets.push_back({ 2,4 });
    Sets.push_back({ 3,7 });
    Sets.push_back({ 8,12 });
    Sets.push_back({ 10,15 });
    Sets.push_back({ 17,18 });
    Stack<Pair<int, int>> s(6);
    Pair<int, int>temp;
    int last=0, first=0;
    for (int i = 0; i < Sets.size(); i++)
    {
        first = Sets[i].first;
        if (first >= last)
        {
            s.push(Sets[i]);
            last = Sets[i].second;
        }
        else
        {
            temp = s.pop();
            Sets[i].first = temp.first;
            last = Sets[i].second;
            s.push(Sets[i]);
        }
    }
 
 
}
 
*/
 
/*
#include<iostream>
#include<queue>
using namespace std;
 
class Node
{
public:
    int data;
    Node* lchild;
    Node* rchild;
 
};
 
class BTree
{
    Node* root;
public:
    BTree()
    {
        root = 0;
    }
    void create()
    {
        Node* temp;
        Node* p;
        queue <Node*>q;
        int x;
        cout << "Enter data for root: ";
        cin >> x;
        root = new Node();
        temp = root;
        root->data = x;
        root->lchild = 0;
        root->rchild = 0;
        q.emplace(root);
        while (!q.empty())
        {
            cout << "Enter left child of " << temp->data<<": ";
            cin >> x;
            if (x != -1)
            {
                p = new Node();
                temp->lchild = p;
                p->data = x;
                p->lchild = 0;
                p-> rchild = 0;
                q.emplace(p);
            }
            cout << "Enter right child of " << temp->data << ": ";
            cin >> x;
            if (x != -1)
            {
                p = new Node();
                temp->rchild = p;
                p->data = x;
                p->lchild = 0;
                p->rchild = 0;
                q.emplace(p);
            }
            q.pop();
            if(!q.empty())
                temp = q.front();
        }
    }
    void preOrder(Node* temp)
    {
        if (temp != 0)
        {
            cout << temp->data << " ";
            preOrder(temp->lchild);
            preOrder(temp->rchild);
        }
    }
    void inorderTraversal(Node* temp)
    {
        if (temp != 0)
        {
            inorderTraversal(temp->lchild);
            cout << temp->data << " ";
            inorderTraversal(temp->rchild);
        }
    }
    void postTraversal(Node* temp)
    {
        if (temp != 0)
        {
            postTraversal(temp->lchild);
            postTraversal(temp->rchild);
            cout << temp->data << " ";
        }
    }
    Node* getRoot()
    {
        return root;
    }
    void levelTraversal(Node * temp)
    {
        Node* t;
        queue<Node*>q;
        q.emplace(temp);
        cout << temp->data << " ";
        while (!q.empty())
        {
            t = q.front();
            q.pop();
            if (t->lchild != 0)
            {
                q.emplace(t->lchild);
                cout << t->lchild->data << " ";
            }
            if (t->rchild!= 0)
            {
                q.emplace(t->rchild);
                cout << t->rchild->data << " ";
            }
        }
 
    }
};
 
 
class BST
{
    Node* root;
 
public:
    BST() :root(0) {}
    Node* getRoot() { return root; }
    Node* create(int d, Node* temp)
    {
        Node* newNode = 0;
        if (temp == 0)
        {
            newNode = new Node();
            newNode->data = d;
            newNode->lchild = newNode->rchild = 0;
            if (root == 0)
                root = newNode;
            return newNode;
        }
        else if (d < temp->data)
        {
            temp->lchild = create(d, temp->lchild);
        }
        else if (d > temp->data)
        {
            temp->rchild = create(d, temp->rchild);
        }
        return temp;
    }
 
    void insert(int d, Node* temp)
    {
        Node* p = 0;
        Node* newNode = 0;
        if (d < temp->data)
        {
            while (temp != 0)
            {
                p = temp;
                temp = temp->lchild;
            }
            if (d < p->data)
            {
                newNode = new Node();
                newNode->data = d;
                newNode->lchild = newNode->rchild = 0;
                p->lchild = newNode;
            }
            else
            {
                newNode = new Node();
                newNode->data = d;
                newNode->lchild = newNode->rchild = 0;
                p->rchild = newNode;
            }
        }
        else if (d > temp->data)
        {
            while (temp != 0)
            {
                p = temp;
                temp = temp->rchild;
            }
            if (d < p->data)
            {
                newNode = new Node();
                newNode->data = d;
                newNode->lchild = newNode->rchild = 0;
                p->lchild = newNode;
            }
            else
            {
                newNode = new Node();
                newNode->data = d;
                newNode->lchild = newNode->rchild = 0;
                p->rchild = newNode;
            }
        }
 
    }
    void search(int d, Node* temp)
    {
        if (temp == 0)
        {
            cout << "Not found";
            return;
        }
        else if (temp->data == d)
        {
            cout << "Found";
            return;
        }
        else if (d < temp->data)
        {
            search(d, temp->lchild);
        }
        else if (d > temp->data)
        {
            search(d, temp->rchild);
        }
 
    }
    void iterativesearch(int d, Node* temp)
    {
        while (temp != 0)
        {
            if (temp->data == d)
            {
                cout << "found";
                break;
            }
            if (d < temp->data)
            {
                temp = temp->lchild;
            }
            else if (d > temp->data)
            {
                temp = temp->rchild;
            }
        }
        if (temp == 0)
        {
            cout << "Not found";
        }
    }
    void preOrder(Node* temp)
    {
        if (temp != 0)
        {
            cout << temp->data << " ";
            preOrder(temp->lchild);
            preOrder(temp->rchild);
        }
    }
    void postTraversal(Node* temp)
    {
        if (temp != 0)
        {
            postTraversal(temp->lchild);
            postTraversal(temp->rchild);
            cout << temp->data << " ";
        }
    }
    Node* findMin(Node* temp)
    {
        while (temp->lchild != 0)
        {
            temp = temp->lchild;
        }
        return temp;
    }
    Node* deleteNode(Node* temp, int d)
    {
        if (d < temp->data)
        {
            temp->lchild = deleteNode(temp->lchild, d);
        }
        else if (d > temp->data)
        {
            temp->rchild = deleteNode(temp->rchild, d);
        }
        else
        {
            if (temp->rchild == 0 && temp->lchild == 0)
            {
                delete temp;
                temp = 0;
                return temp;
            }
            else if (temp->rchild == 0)
            {
                Node* newNode = temp->lchild;
                delete temp;
                return newNode;
            }
            else if (temp->lchild == 0)
            {
                Node* newNode = temp->rchild;
                delete temp;
                return newNode;
            }
            else
            {
                Node* newNode = findMin(temp->rchild);
                temp->data = newNode->data;
                temp->rchild = deleteNode(temp->rchild, newNode->data);
                return temp;
            }
            //return temp;
        }
 
    }
    int findMax(Node* temp)
    {
        if (temp->rchild == 0)
        {
            return temp->data;
        }
        else
        {
            return  findMax(temp->rchild);
        }
    }
    int findMinn(Node* temp)
    {
        if (temp->lchild == 0)
        {
            return temp->data;
        }
        else
        {
            return  findMinn(temp->lchild);
        }
    }
    void levelTraversal(Node* temp)
    {
        queue<Node*>q;
        Node* second;
        q.emplace(temp);
        //cout << temp->data << " ";
        while (!q.empty())
        {
            second = q.front();
            q.pop();
            cout << second->data << " ";
            if (second->lchild != 0)
            {
                q.emplace(second->lchild);
            }
            if (second->rchild != 0)
            {
                q.emplace(second->rchild);
            }
 
        }
    }
    vector<int>auxilary;
    void inorderTraversal(Node* t)
    {
        if (t != 0)
        {
            inorderTraversal(t->lchild);
            cout << t->data << " ";
            auxilary.push_back(t->data);
            inorderTraversal(t->rchild);
        }
    }
    void BstFromSortedArray(Node* temp, int l , int r)
    {
        int mid = 0;
        if (l <= r)
        {
            mid = (l + r) / 2;
            create(auxilary[mid], temp);
            BstFromSortedArray(getRoot() , l, mid - 1);
            BstFromSortedArray(getRoot(), mid + 1, r);
        }
    }
    int heightOfBST(Node* temp)
    {
        if (temp == 0)
        {
            return 0;
        }
        return 1 + max(heightOfBST(temp->lchild), heightOfBST(temp->rchild));
    }
    void balanceBST(Node* temp)
    {
        inorderTraversal(temp);
        clear(temp);
        root = 0;
         BstFromSortedArray(root,0,(auxilary.size()-1));
 
    }
 
    Node* prev = 0;
    bool isBST(Node* root )
    {
        if (root == 0)
        {
            return true;
        }
        if (root->lchild != 0 && root->lchild->data > root->data)
        {
            return false;
        }
        if (root->rchild != 0 && root->rchild->data < root->data)
        {
            return false;
        }
        if (!isBST(root->lchild) || !isBST(root->rchild))
        {
            return false;
        }
        return true;
 
    }
    bool isComplete(Node* temp)
    {
        Node* d;
        queue<Node*>q;
        q.emplace(temp);
        while (!q.empty())
        {
            d = q.front();
            q.pop();
            if (d->lchild == 0 && d->rchild != 0)
            {
                if (d->rchild->lchild != 0 || d->rchild->rchild != 0)
                {
                    return false;
                }
            }
            else if (d->rchild == 0 && d->lchild != 0)
            {
                if (d->lchild->lchild != 0 || d->lchild->rchild != 0)
                {
                    return false;
                }
            }
            else
            {
                if (d->lchild != 0)
                {
                    q.emplace(d->lchild);
                }
                else if (d->rchild != 0)
                {
                    q.emplace(d->rchild);
                }
            }
        }
        return true;
    }
 
    void clear(Node* temp)
    {
        if(temp != 0)
        {
            clear(temp->lchild);
            clear(temp->rchild);
            delete temp;
            temp = 0;
        }
    }
    bool isBalance(Node* temp)
    {
        if (temp == 0)
        {
            return true;
        }
        int lh = heightOfBST(temp->lchild);
        int rh = heightOfBST(temp->rchild);
        if (abs(lh - rh) <= 1 && isBalance(temp->lchild) && isBalance(temp->rchild))
            return true;
        return false;
    }
 
};
 
 
int main()
{
    BST t;
    BTree bt;
    Node* temp = 0;
    t.create(13, temp);
    temp = t.getRoot();
    t.create(8, temp);
    t.create(9, temp);
    t.create(5, temp);
    t.insert(6, temp);
    t.create(18, temp);
    t.create(20, temp);
    t.insert(17, temp);
    t.create(4, temp);
 
    //t.insert(7, temp);
    cout<<t.isBST(temp);
    //t.balanceBST(temp);
    //cout << t.isBalance(t.getRoot());
    //cout << "height of bst is " << t.heightOfBST(temp);
    //cout << "
";
    //t.inorderTraversal(t.getRoot());
    //cout << "
"<<t.findMax(temp);
    //cout << "
" << t.findMinn(temp);
}
*/
 
 
/***************************************************************************
* Author: Muhammad Rafi                                                    *
* Purpose: Geenral Binary Search Tree                                      *
* Dated: November 01, 2007                                                 *
* Version: 1.2   BST along with functions                                  *
* Last modified: December 03, 2007                                        *
****************************************************************************/
/*#include <queue>
#include <stack>
 
#ifndef BINARY_SEARCH_TREE
#define BINARY_SEARCH_TREE
 
template<class T>
class Stack : public stack<T> {
public:
    T pop() {
        T tmp = top();
        stack<T>::pop();
        return tmp;
    }
};
 
template<class T>
class Queue : public queue<T> {
public:
    T dequeue() {
        T tmp = front();
        queue<T>::pop();
        return tmp;
    }
    void enqueue(const T& el) {
        push(el);
    }
};
template<class T> class BST;
 
template<class T>
class BSTNode {
public:
    BSTNode() {
        left = right = 0;
    }
    BSTNode(const T& e, BSTNode<T> *l = 0, BSTNode<T> *r = 0) {
        el = e; left = l; right = r;
    }
    T el;
    BSTNode<T> *left, *right;
};
 
template<class T>
class BST {
public:
    BST() {
        root = 0;
    }
    ~BST() {
        clear();
    }
    void clear() {
        clear(root);
        root = 0;
    }
    bool isEmpty() const {
        return root == 0;
    }
    void preorder() {
        preorder(root);
    }
    void inorder() {
        inorder(root);
    }
    void postorder() {
        postorder(root);
    }
    void insert(const T&);
    void recursiveInsert(const T& el) {
        recursiveInsert(root,el);
    }
    T* search(const T& el) const {
        return search(root,el);
    }
    T* recursiveSearch(const T& el) const {
        return recursiveSearch(root,el);
    }
    void deleteByCopying(BSTNode<T>*&);
    void findAndDeleteByCopying(const T&);
    void deleteByMerging(BSTNode<T>*&);
    void findAndDeleteByMerging(const T&);
    void iterativePreorder();
    void iterativeInorder();
    void iterativePostorder();
    void breadthFirst();
    void MorrisPreorder();
    void MorrisInorder();
    void MorrisPostorder();
    void balance(T*,int,int);
protected:
    BSTNode<T>* root;
    void clear(BSTNode<T>*);
    void recursiveInsert(BSTNode<T>*&, const T&);
    T* search(BSTNode<T>*, const T&) const;
    T* recursiveSearch(BSTNode<T>*, const T&) const;
    void preorder(BSTNode<T>*);
    void inorder(BSTNode<T>*);
    void postorder(BSTNode<T>*);
    virtual void visit(BSTNode<T>* p) {
        cout << p->el << ' ';
    }
};
 
template<class T>
void BST<T>::clear(BSTNode<T> *p) {
    if (p != 0) {
         clear(p->left);
         clear(p->right);
         delete p;
     }
}
 
template<class T>
void BST<T>::insert(const T& el) {
    BSTNode<T> *p = root, *prev = 0;
    while (p != 0) {  // find a place for inserting new node;
        prev = p;
        if (el < p->el)
             p = p->left;
        else p = p->right;
    }
    if (root == 0)    // tree is empty;
         root = new BSTNode<T>(el);
    else if (el < prev->el)
         prev->left  = new BSTNode<T>(el);
    else prev->right = new BSTNode<T>(el);
}
 
template<class T>
void BST<T>::recursiveInsert(BSTNode<T>*& p, const T& el) {
    if (p == 0)
         p = new BSTNode<T>(el);
    else if (el < p->el)
         recursiveInsert(p->left, el);
    else recursiveInsert(p->right,el);
}
 
template<class T>
T* BST<T>::search(BSTNode<T>* p, const T& el) const {
    while (p != 0)
        if (el == p->el)
             return &p->el;
        else if (el < p->el)
             p = p->left;
        else p = p->right;
    return 0;
}
 
template<class T>
T* BST<T>::recursiveSearch(BSTNode<T>* p, const T& el) const {
    if (p != 0)
         if (el == p->el)
              return &p->el;
         else if (el < p->el)
              return recursiveSearch(p->left,el);
         else return recursiveSearch(p->right,el);
    else return 0;
}
 
template<class T>
void BST<T>::inorder(BSTNode<T> *p) {
     if (p != 0) {
         inorder(p->left);
         visit(p);
         inorder(p->right);
     }
}
 
template<class T>
void BST<T>::preorder(BSTNode<T> *p) {
    if (p != 0) {
        visit(p);
        preorder(p->left);
        preorder(p->right);
    }
}
 
template<class T>
void BST<T>::postorder(BSTNode<T>* p) {
    if (p != 0) {
        postorder(p->left);
        postorder(p->right);
        visit(p);
    }
}
 
template<class T>
void BST<T>::deleteByCopying(BSTNode<T>*& node) {
    BSTNode<T> *previous, *tmp = node;
     if (node->right == 0)                  // node has no right child;
          node = node->left;
     else if (node->left == 0)              // node has no left child;
          node = node->right;
     else {
          tmp = node->left                  // node has both children;
          previous = node;                  // 1.
          while (tmp->right != 0) {         // 2.
              previous = tmp;
              tmp = tmp->right;
          }
          node->el = tmp->el;               // 3.
          if (previous == node)
               previous->left  = tmp->left;
          else previous->right = tmp->left; // 4.
     }
     delete tmp;                            // 5.
}
 
// findAndDeleteByCopying() searches the tree to locate the node containing
// el. If the node is located, the function DeleteByCopying() is called.
 
template<class T>
void BST<T>::findAndDeleteByCopying(const T& el) {
    BSTNode<T> *p = root, *prev = 0;
     while (p != 0 && !(p->el == el)) {
         prev = p;
         if (el < p->el)
              p = p->left;
         else p = p->right;
     }
     if (p != 0 && p->el == el)
          if (p == root)
               deleteByCopying(root);
          else if (prev->left == p)
               deleteByCopying(prev->left);
          else deleteByCopying(prev->right);
     else if (root != 0)
          cout << "el " << el << " is not in the tree
";
     else cout << "the tree is empty
";
}
 
template<class T>
void BST<T>::deleteByMerging(BSTNode<T>*& node) {
    BSTNode<T> *tmp = node;
    if (node != 0) {
        if (!node->right)           // node has no right child: its left
             node = node->left;     // child (if any) is attached to its parent;
        else if (node->left == 0)   // node has no left child: its right
             node = node->right;    // child is attached to its parent;
        else {                      // be ready for merging subtrees;
             tmp = node->left;      // 1. move left
             while (tmp->right != 0)// 2. and then right as far as possible;
                tmp = tmp->right;
             tmp->right =           // 3. establish the link between the
                node->right;        //    the rightmost node of the left
                                    //    subtree and the right subtree;
             tmp = node;            // 4.
             node = node->left;     // 5.
        }
        delete tmp;                 // 6.
     }
}
 
template<class T>
void BST<T>::findAndDeleteByMerging(const T& el) {
    BSTNode<T> *node = root, *prev = 0;
    while (node != 0) {
        if (node->el == el)
             break;
        prev = node;
        if (el < node->el)
             node = node->left;
        else node = node->right;
    }
    if (node != 0 && node->el == el)
         if (node == root)
              deleteByMerging(root);
         else if (prev->left == node)
              deleteByMerging(prev->left);
         else deleteByMerging(prev->right);
    else if (root != 0)
         cout << "el " << el << " is not in the tree
";
    else cout << "the tree is empty
";
}
 
template<class T>
void BST<T>::iterativePreorder() {
    Stack<BSTNode<T>*> travStack;
    BSTNode<T> *p = root;
    if (p != 0) {
        travStack.push(p);
        while (!travStack.empty()) {
            p = travStack.pop();
            visit(p);
            if (p->right != 0)
                 travStack.push(p->right);
            if (p->left != 0)             // left child pushed after right
                 travStack.push(p->left); // to be on the top of the stack;
        }
    }
}
 
template<class T>
void BST<T>::iterativeInorder() {
    Stack<BSTNode<T>*> travStack;
    BSTNode<T> *p = root;
    while (p != 0) {
        while (p != 0) {                 // stack the right child (if any)
            if (p->right)                // and the node itself when going
               travStack.push(p->right); // to the left;
            travStack.push(p);
            p = p->left;
        }
        p = travStack.pop();             // pop a node with no left child
        while (!travStack.empty() && p->right == 0) { // visit it and all nodes
            visit(p);                                 // with no right child;
            p = travStack.pop();
        }
        visit(p);                        // visit also the first node with
        if (!travStack.empty())          // a right child (if any);
             p = travStack.pop();
        else p = 0;
    }
}
 
template<class T>
void BST<T>::iterativePostorder() {
    Stack<BSTNode<T>*> travStack;
    BSTNode<T>* p = root, *q = root;
    while (p != 0) {
        for ( ; p->left != 0; p = p->left)
            travStack.push(p);
        while (p->right == 0 || p->right == q) {
            visit(p);
            q = p;
            if (travStack.empty())
                 return;
            p = travStack.pop();
        }
        travStack.push(p);
        p = p->right;
     }
}
 
template<class T>
void BST<T>::breadthFirst() {
    Queue<BSTNode<T>*> queue;
    BSTNode<T> *p = root;
    if (p != 0) {
        queue.enqueue(p);
        while (!queue.empty()) {
            p = queue.dequeue();
            visit(p);
            if (p->left != 0)
                 queue.enqueue(p->left);
            if (p->right != 0)
                 queue.enqueue(p->right);
        }
    }
}
 
template<class T>
void BST<T>::MorrisInorder() {
    BSTNode<T> *p = root, *tmp;
    while (p != 0)
        if (p->left == 0) {
             visit(p);
             p = p->right;
        }
        else {
             tmp = p->left;
             while (tmp->right != 0 &&// go to the rightmost node of
                    tmp->right != p)  // the left subtree or
                  tmp = tmp->right;   // to the temporary parent of p;
             if (tmp->right == 0) {   // if 'true' rightmost node was
                  tmp->right = p;     // reached, make it a temporary
                  p = p->left;        // parent of the current root,
             }
             else {                   // else a temporary parent has been
                  visit(p);           // found; visit node p and then cut
                  tmp->right = 0;     // the right pointer of the current
                  p = p->right;       // parent, whereby it ceases to be
             }                        // a parent;
        }
}
 
template<class T>
void BST<T>::MorrisPreorder() {
    BSTNode<T> *p = root, *tmp;
    while (p != 0) {
        if (p->left == 0) {
             visit(p);
             p = p->right;
        }
        else {
             tmp = p->left;
             while (tmp->right != 0 &&// go to the rightmost node of
                    tmp->right != p)  // the left subtree or
                  tmp = tmp->right;   // to the temporary parent of p;
             if (tmp->right == 0) {   // if 'true' rightmost node was
                  visit(p);           // reached, visit the root and
                  tmp->right = p;     // make the rightmost node a temporary
                  p = p->left;        // parent of the current root,
             }
             else {                   // else a temporary parent has been
                  tmp->right = 0;     // found; cut the right pointer of
                  p = p->right;       // the current parent, whereby it ceases
             }                        // to be a parent;
        }
    }
}
 
template<class T>
void BST<T>::MorrisPostorder() {
    BSTNode<T> *p = new BSTNode<T>(), *tmp, *q, *r, *s;
    p->left = root;
    while (p != 0)
        if (p->left == 0)
             p = p->right;
        else {
             tmp = p->left;
             while (tmp->right != 0 &&// go to the rightmost node of
                    tmp->right != p)  // the left subtree or
                  tmp = tmp->right;   // to the temporary parent of p;
             if (tmp->right == 0) {   // if 'true' rightmost node was
                  tmp->right = p;     // reached, make it a temporary
                  p = p->left;        // parent of the current root,
             }
             else {             // else a temporary parent has been found;
                  // process nodes between p->left (included) and p (excluded)
                  // extended to the right in modified tree in reverse order;
                  // the first loop descends this chain of nodes and reverses
                  // right pointers; the second loop goes back, visits nodes,
                  // and reverses right pointers again to restore the pointers
                  // to their original setting;
                  for (q = p->left, r = q->right, s = r->right;
                       r != p; q = r, r = s, s = s->right)
                      r->right = q;
                  for (s = q->right; q != p->left;
                      q->right = r, r = q, q = s, s = s->right)
                     visit(q);
                  visit(p->left);     // visit node p->left and then cut
                  tmp->right = 0;     // the right pointer of the current
                  p = p->right;       // parent, whereby it ceases to be
             }                        // a parent;
        }
}
 
template<class T>
void BST<T>::balance (T data[], int first, int last) {
    if (first <= last) {
        int middle = (first + last)/2;
        insert(data[middle]);
        balance(data,first,middle-1);
        balance(data,middle+1,last);
    }
}
 
#endif*/
/*
 
#include<iostream>
using namespace std;
 
class Queue
{
    int front;
    int rear;
    int* arr;
    int size;
public:
    Queue(int s)
    {
        size = s;
        arr = new int[s];
        front = 0;
        rear = 0;
    }
    bool isFull()
    {
        if (((rear + 1) % (size)) == front)
        {
            return true;
        }
        return false;
    }
    bool isEmpty()
    {
        if (front == rear )
        {
            return true;
        }
        return false;
    }
    void enqueue(int d)
    {
        if (!isFull())
        {
            rear = ((rear + 1) % (size));
            arr[rear] = d;
        }
    }
    int dequeue()
    {
        if (!isEmpty())
        {
            front = (front + 1) % (size);
            return arr[front];
        }
 
    }
 
};
 
int main()
{
    Queue q(7);
    q.enqueue(432);
    q.enqueue(12);
    q.enqueue(432);
    q.enqueue(2);
    q.enqueue(52);
    q.enqueue(52);
    q.enqueue(2);
    cout<<q.dequeue()<<" ";
    cout << q.dequeue() << " ";
    q.enqueue(232);
    q.enqueue(17);
    cout << "
";
    for (int i = 0; i < 7; i++)
    {
        cout << q.dequeue() << " ";
    }
    //q.enqueue(4321);
    //q.enqueue(154);
    //q.enqueue(4322);
}
#include<iostream>
using namespace std;
 
class Heap
{
    int* heap;
    int hsize;
public:
    Heap() :heap(0) {}
    void swap(int& first, int& second)
    {
        int temp;
        temp = first;
        first = second;
        second = temp;
    }
    void upheap(int index)
    {
        while (index > 1)
        {
            if (heap[index / 2] < heap[index])
            {
                swap(heap[index / 2], heap[index]);
                index = index / 2;
            }
            else
            {
                break;
            }
        }
    }
    void createHeap(int* arr, int size)
    {
        hsize = size + 1;
        heap = new int[hsize];
        for (int i = 1; i < size; i++)
        {
            heap[i] = arr[i];
            upheap(i);
        }
    }
    void heapSort(int n)
    {
        int temp;
        temp = heap[1];
        heap[1] = heap[n];
        heap[n] = temp;
        int j = 2 * 1 , i=1;
        while (j<n-1)
        {
            if (heap[j+1] > heap[j])
            {
                j = j + 1;
            }
            if (heap[i] < heap[j])
            {
                swap(heap[j], heap[i]);
                i = j;
                j = 2 * i;
            }
            else
            {
                break;
            }
        }
 
    }
 
    void display()
    {
        for (int i = 1; i < hsize - 1; i++)
        {
            cout << heap[i] << " ";
        }
    }
 
 
};
 
void shellsort(int* arr, int size)
{
    for (int gap = size / 2; gap > 0; gap /= 2)
    {
        for (int i = gap; i < size; i++)
        {
            int temp = arr[i];
            int j=0;
            for (int j = i; j >= gap && arr[j - gap] > temp; j -= gap)
            {
                arr[j] = arr[j - gap];
            }
            arr[j] = temp;
        }
 
    }
 
}
 
int main()
{
    Heap h;
    int arr[] = { 0,10,20,30,25,5,40,35};
 
    h.createHeap(arr,8);
    for (int i = 7; i >= 1; i--) {
        h.heapSort(i);
    }
    h.display();
}*/
#include<iostream>
#include<vector>
using namespace std;
int main()
{
    /*int n = 0, b = 0, l = 1, cnt = 0;
    cin >> n;
    n = n - (l + b);
    b++;
    l++;
    while (n > 0)
    {
        if (n == 1) {
            cnt = 1;
            break;
        }
        n = n - (l + b);
        b++;
        l++;
        if (n > 0)
            cnt++;
    }
    cout << cnt;*/
    int n;
    string temp;
    cin >> n;
    vector<string>words;
    for (int i = 0; i < n; i++)
    {
        cin >> temp;
        words.push_back(temp);
    }
    for (int j = 0; j < n; j++)
    {
        if (words[j].size() > 10)
        {
            cout << words[j][0] << words[j].size() - 2 << words[j][words[j].size() - 1]<<"
";
 
        }
        else
        {
            cout << words[j] << "
";
        }
    }
 
}