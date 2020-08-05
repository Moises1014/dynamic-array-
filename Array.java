public class Array{
  private int[] items;
  private int count;

  //class constructor
  public Array(int length){
    items = new int[length];
  }

  //insert item to array 
  public void insert(int item){
    //if array is full make it bigger, by copying the element to a bigger array
    if(items.length == count){
      int[] new_items = new int[count*2];
      for(int i =0; i<count; i++){
        new_items[i] = items[i];       
      }
      items = new_items;
    }
    //Add the item to the end of array
    items[count] = item;
    count++;
  }

  //algorithm to remove a Item in a certain index
  public void removeAt(int index){
    //Gets the number to the rigth of the index and moves all number index one to the left
    if(!(index < 0 || index >= count)){
      for(int i = index; i < count; i++){
        items[i] = items[i+1];
      }
      //make the array one item smaller
      count--;
    } else{
    throw new IllegalArgumentException("index seleceted out of range");
    }
  }

  //serach for item in array and gives you the index
  public int indexOf(int number){
    for(int i =0; i<count; i++){
      if(items[i] == number){
        return i;
      }
    }
    return -1;
  }

  //algorithm to print items in array by line
  public void print(){
    for(int i =0; i<count; i++){
      System.out.println(items[i]);
    }
  }
}