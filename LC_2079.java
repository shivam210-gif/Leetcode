public class LC_2079 {
    public static int wateringPlants(int[] plants, int capacity) {
        int i=0;
        int x=0;
        int y=0;
        int m=capacity;
        while(i<plants.length){
            if(plants[i]>capacity){
                capacity=m;
                x+=(i*2)+1;
                capacity-=plants[i];
            }
            else{
                capacity-=plants[i];
                x++;
            }
            i++;
        }
        return x;  
    }
    public static void main(String[] args) {
        int[]plants = {2,2,3,3};
        int capacity=5;
        System.out.println(wateringPlants(plants,capacity));
    }
}
