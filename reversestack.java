import java.util.*;


class Main
{
   static class Stack
   {
    int stack[];
    //int temp[];
    int top=-1;
    int size;
    int val;
    Stack(int capacity)
    {
        stack=new int[capacity];
        //temp=new int[capacity];
        size=capacity;
    }
    void push(int value)
    {
        if(top<size-1)
        {
            stack[++top]=value;
        }
        else if(top==size-1)
       {
           System.out.println("Stack is full");
       }
    }
 int pop()
{
    if(top>=0)
    {
        val=stack[top];
        --top;
    }
    else if(top==-1)
    {
        System.out.println("Stack is empty");
    }
    return val;
}
void display()
{
    int i=0;
    while(i<=top)
    {
        System.out.print(stack[i]+" ");
        i++;
    }
}
int peekdisplay()
{
    int peek=stack[top];
    return peek;
}
void reverse()
{
    int temp[] =new int[size];
    int x=top;
    for(int i=0;i<=x;i++)
    {
        temp[i]=pop();
    }
    top=x;
    for(int j=0;j<=top;j++)
    {
    stack[j]=temp[j];
    }
}
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack(3);
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.display();
        System.out.println("\nAfter poping:");
        s.pop();
        s.display();
        int result=s.peekdisplay();
        System.out.println("\nPeak element is:"+result);
        s.reverse();
        s.display();
    }
}
