import java.util.Stack;

class StackDemo 
{
    public static void main(String[] args) 
    {
      Stack<Integer> stack=new Stack<>();
      
        stack.push(11);
        stack.push(27);
        stack.push(12);
        stack.push(24);
        stack.push(21);
        stack.push(20);
        stack.push(10);
        System.out.println(stack);
        
        System.out.println(" Element Popped "+stack.pop());
        System.out.println(" isEmpty or not "+stack.isEmpty());
        System.out.println("Size of Stack is "+stack.size());
        System.out.println(" Index of Element is "+stack.search(24));

        }
    }
    


