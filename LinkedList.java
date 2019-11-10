
public class unsortedLL {
	
	//Basic structure of a node
	private static class Node 
	{
		String data;
		Node nextNode;
		int count;
	}
	
	private static Node head;	//Head and tail of the LL
	
	public static Node newNode (String word)
	{
		Node temp = new Node();
		
		temp.data = word;
		temp.nextNode = null;
		temp.count = 1;
	
		return temp;
	}
	
	//Search Function to find word in LL
	public static Node searchNode(String word)
	{
		Node currentNode = head;	//Get the current head of the LL
		
		while (currentNode!= null)	//Traverse through LL until we head the end
		{
			
			if (currentNode.data == word) //If word is found in LinkedList it returns node with a word.
				return currentNode;
			else 
				currentNode = currentNode.nextNode;	//If word is not in in this node move to the next node
		
		}	//End of while loop -> Finished traversing through LL
		
		//If word was not found return node with a count of -1
		Node tempNode = newNode(word);
		tempNode.count = -1;			//works only when we don't found the word in Linked List 
		return tempNode;
		
	}
		//End of search ()
	
	//Function that inserts node into LL
	public static  void insertNode (String word)
	
	{
		//First check if head is empty
		if (head == null) 
		{
			head = newNode (word);		//Pass the new data to the head of the LL
			return;		//Insertion was completed by inserting the data into the head of the LL
		}
		
		//If head is not empty
		else 
		{
			//SearchNode() returns a node with -1 if word/data was not found
			//Check if searchNode returned a node with count -1, else it returned node == word
			if (searchNode(word).count == -1)	//If we didn't find the word, then 
				{
			

					Node lastNode = head;
					
					//Traverse through the LL until we find a node which node.next == NULL
					while (head.nextNode != null) 
						head = head.nextNode;

					
					head.nextNode = newNode(word);	//Insert a new node at the end of the linkedList  
					
					
				}
			
			else	//If the search returned the node where the data/word was found 
				searchNode(word).count ++;	//Add to the count of the node with the data/word
				
		}	//End of else
		
		 
	}
	
	//Function to print LL
	public static void printLL ()
	{
		Node currentNode = head;
		
		while (currentNode != null)
		{
			System.out.println(currentNode.data + ": " + currentNode.count);
			currentNode = currentNode.nextNode;
		}
		
	}
}



//public String Data;
//
//public unsortedLL Next;
//
//public unsortedLL (String Data, unsortedLL Next)
//{
//	this.Data = Data;
//	this.Next = Next;
//	
//}
//public String toString()
//{
//	return Data;
//}
