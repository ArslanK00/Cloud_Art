public class Node
{
    private int[][] data;
    private Node next; 

    
    public Node(int[][] d, Node n)
    {
        data = d;
        next = n;
    }

    public Node GetNext(){return next;}
    public void SetNext(Node n){next = n;}
    public int[][] GetData(){return data;} //fix
    public void SetData(int[][] d){data = d;}
}