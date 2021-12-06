package fr.univamu.iut.exo1;

public class Client {
    public static void main(String[] args) {
        // TODO Analyse the input ?
    	
    	Expression a = new Number(5);
    	Expression b = new Number(3);
    	Expression node = new InternalNode(InternalNode.OPERATOR_MULTIPLY, a,b);
    	
    	
    	Expression a1 = new Number(5);
    	Expression b1 = new Number(2);
    	Expression c1 = new Number(3);
    	Expression node2 = new InternalNode(InternalNode.OPERATOR_MINUS, b1, c1);
    	Expression node1 = new InternalNode(InternalNode.OPERATOR_MULTIPLY, node2, a1);
    	
    	System.out.println(node.evaluate());
    	System.out.println(node1.evaluate());
    	
    }
}
