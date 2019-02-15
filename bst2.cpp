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

void inorder(node *t)
{
    Stack s;
    s.init();

    while(t!=NULL)
    {
        s.push(t);
        t=t->left;
    }

    while(!s.isEmpty())
    {
         t=s.pop();
         cout<<t->data;
         t=t->right;

    while(t!=NULL)
    {
        s.push(t);
        t=t->left;

    }

    }


}


void preorder(node *t)
{
    Stack s;
    s.init()
    while(t!=NULL)
    {
        cout<<t->data;
        s.push(t);
        t=t->left;
    }
    while(!s.isEmpty())
    {
        t=s.pop();
        t=t->right;
        while(t!=NULL)
        {
            cout<<t->data;
            s.push(t);
            t=t->left;
        }
    }
}