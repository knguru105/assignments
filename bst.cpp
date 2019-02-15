#include<iostream>
#include<stdio.h>
#define NULL __null
struct node
{
int data;
node *left,*right;
};

class bst
{
private:
node *root;
public:
bst()
{
root=NULL;
}

void insert(int n)
{
    node *p,*t;
    if(root==NULL)
    {
    root= new node();
    root->data=n;
    root->left=NULL;
    root->right=NULL;
    }
    else
    {
        t=new node();
        t->data=n;
        t->left=NULL;
        t->right=NULL;
        p=root;
        while(p!=NULL)
        {
            if(n>p->data)
            {
                if(p->right==NULL)
                {
                    p->right=t;
                    return;
                }
                p=p->right;
            }
            else
            {
                if(p->left==NULL)
                {
                    p->left=t;
                    return;
                }
                p=p->left;
            }

        }
    }

}

void search(int n)
{
    node *t;
    t=root;
    while(t!=NULL)
    {
        if(n==t->data)
        {
            cout<<"element found";
            return;
        }
        else if(n>t->data)
        {
            t=t->right;
        }
        else
        {
            t=t->left;
        }

    }
    cout<<"not found";
}



void display()
{
    node *t;
    t=root;
    while(t!=NULL)
    {
        cout<<t->data;
        t=t->left;
    }
}


};

int main()
{
    bst bs;
    bs.insert(3);
    bs.insert(3);
    bs.insert(3);
    bs.insert(3);
    bs.display();
    bs.search(3);
    return 1;
}