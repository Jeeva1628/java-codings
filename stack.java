import java.util.*;


class Main
{
     static class Stack
   {
    int stack[];
    int top=-1;
    int size;
    Stack(int capacity)
    {
        stack=new int[capacity];
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
void pop()
{
    if(top>=0)
    {
        --top;
    }
    else if(top==-1)
    {
        System.out.println("Stack is empty");
    }
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
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack(5);
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.display();
        System.out.println("\nAfter poping:");
        s.pop();
        s.display();
        
        
    }
}
