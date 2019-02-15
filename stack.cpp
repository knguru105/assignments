#include<iostream>
using namespace std;
struct node
{
    int data;
    node *next;
};
 class stack
{
    private:
    node *top;
    public:
    void newStack()
    {
        top=NULL;
    }
    void stackPush(int n)
    {
        node *t,*p;
        if(top==NULL)
        {
            top=new node();
            top->data=n;
            top->next=NULL;
            //cout<<"overflow";
        }
        else
             {
                 t=new node();
                 t->data=n;
                 t->next=NULL;
                 p=top;
                 while(p->next!=NULL)
                 {
                     p=p->next;
                 }
p->next=t;

           }

    }
    int stackPop()
    {
       int c;node *p,*r;

        if(top==NULL)
        {
            cout<<"empty";
            //return 0;
        }
        else if(top->next==NULL)
        {
            c=top->data;
            top=NULL;
            return c;
        }
        else
        {
            p=top;
            while(p->next!=NULL)
            {
                r=p;
                p=p->next;
            }
            r->next=NULL;
        }


    }
    bool stackEmpty()
    {
        if(top==NULL)
        {
            return false;
        }
    }
    int stackSize()
    {
        node *t;
        int count=0;
        t=top;
        while(t!=NULL){
            count++;
            t=t->next;
        }
        return count;

    }

    void display()
    {
        node *t;
        t=top;
        while(t!=NULL)
        {
            System.out.prinln("",t->data);
            t=t->next;
        }

    }

};
std::void main()
{
    stack s;
    s.newStack();
    s.stackPush(2);
    s.stackPush(2);
    s.stackPush(2);
    s.stackPush(2);
    s.display();
}