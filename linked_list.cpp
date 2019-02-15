struct node
{
    int data;
    node *next;
};
class linkedklist
{
    private:
    node *head;
    public:
    linkedklist()
    {
        head=null;
    }

    void insert(int n)
    {
        node *t,*p;
        if(head==NULL)
        {
            head=new node;
            head->data=n;
            head->next=NULL;
        }
        else
        {
            t= new node;
            t->data=n;
            t->next=NULL;
            p=head;
            while(p->next!=NULL)
            {
                p=p->next;
            }
            p->next=t;
        }




        }

        void find(int n)
        {
            node *t;
            t=head;
            while(t!=NULL){
                if(t->data==n)
                {
                    cout<<"found";
                    return;
                }
                t=t->next;
            }
            cout<<"not found";

        }

        void deletepos(int pos)
        {
            node *t,*r;
            if(head==NULL)
            {
                cout<<"linked list is empty";
            }
            else if(pos ==1)
            {
                t=head;
                head=head->next;
                delete(t);
            }
            else
            {
                int i;
                t=head;
                for(i=1;i<pos;i++)
                {
                    r=t;
                    t=t->next;
                }
                r->next=t->next;
                delete(t);
            }

        }
        int size()
        {
            int count=0;
            node *t;
            t=head;
            while(t!=NULL)
            {
                count++;
                t=t->next;
            }
            return count;
        }
        bool isEmpty()
        {
            if(head==NULL)
            {
                cout<<"linkedlist empty";
            }
        }

        void display()
        {
            node *t;
            t=head;
            while(t!=NULL)
            {
                cout<<t->data<<"";
                t=t->next;
            }
        }

        void main()
        {
            linkedklist x;
            x.insert(34);
            x.insert(34);
            x.insert(34);
            x.insert(34);
            x.insert(34);

        }
}

