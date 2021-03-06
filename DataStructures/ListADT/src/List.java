
public class List {
	int[] array;
	int length;
	
	public List(){
		this.array = new int[7];
		this.length = 0;
	}
	
	public boolean isFull(){
		if(this.length == this.array.length){
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(this.length == 0){
			return true;
		}
		return false;
	}
	
	public void insert(int element, int position){
		if(isFull()){
			System.out.println("Sorry, can't insert element "+element+" the list is Full!\n");
		}else{
			if(position<1 || position>this.length+1){
				System.out.println("Sorry, can't insert element "+element+" the position is Invalid\n");
			}
			else{
				for(int i =this.length; i>position-1;i--){
					this.array[i] = this.array[i-1];
				}
				this.array[position-1]=element; 	
				this.length++;
			}
		}
	}
	public void insertAtfront(int element){
		int position = 1;
		if(isFull()){
			System.out.println("Sorry, can't insert element "+element+" the list is Full!\n");
		}else{
			if(position<1 || position>this.length+1){
				System.out.println("Sorry, can't insert element "+element+" the position is Invalid\n");
			}else{
				for(int i =this.length; i>position-1;i--){
					this.array[i] = this.array[i-1];
				}
				this.array[position-1]=element; 	
				this.length++;
			}
		}
	}
	
	public void insertAtback(int element){
		int position = this.length+1;
		if(isFull()){
			System.out.println("Sorry, can't insert element "+element+" the list is Full!\n");
		}else{
			this.array[position-1]=element; 	
			this.length++;
		}
	}
	
	public int locate(int element){
		if(isEmpty()){
			System.out.println("The list is empty");
		}else{
			for(int i=0; i<=array.length;i++){
				if(array[i]==element){
					return i;
				}
			}
		}
		return -1;
	}
	
	public int retrieve(int position){
		if(isEmpty()){
			System.out.println("The list is empty");
		}else{
			if(position>this.length || position<0){
				System.out.println("\nInvalid Position");
			}else{
				for(int i=1; i<=this.length;i++){
					if(i==position){
						return array[i-1];
					}
				}
			}
		}
		return -1;
	}
	
	public void delete(int element){
		if(isEmpty()){
			System.out.println("The list is empty");
		}else{
			int position = locate(element);
			if(position==-1){
				System.out.println("Element not found");
			}else{
				for(int i=position; i<this.length-1;i++){
					this.array[i] = this.array[i+1];
				}	
				this.length--;
			}
		}
	}
	
	public void displayList(){
		for(int i=0;i<this.length;i++){
			System.out.print(this.array[i]+ " ");
		}
	}
}