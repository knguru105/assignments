struct node
{
    int data;
    int *next;
};
class queue()
{
    private:
    node *f,*r;
    public:
    void newQueue()
    {
        f=r=NULL;
    }
    void enQueue(int n)
    {
        node *t;
        t=new node;
        t->data=n;
        t->next=NULL;
        if(r==NULL)
        {
            f=r=t;
        }
        else
        {
           r->next=t;
           r=t;
        }

    }

void deQueue()
    {
        node *p;
        if(r==NULL)
        {
            cout<<"queue is empty";
            return 0;

        }
        else if(r->next==NULL)
        {
            f=r=NULL;

        }
        else
        {
            p=f;
            f=f->next;
            c=p->data;
            delete(p);
            }
        }

    }
    void queueSize()
    {
        int count=0;
        if(r==NULL)
        {
            cout<<"queue is empty";
            return 0;

        else if(r[next]!=NULL)
        {
            count++;
        }
    }

void main()
{

	queue q;
q.NewQueue();
q.enQueue(2);
q.enQueue(2);
q.enQueue(2);
q.enQueue(2);




}


}

