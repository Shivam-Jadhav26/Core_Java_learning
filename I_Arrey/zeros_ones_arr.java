public class zeros_ones_arr {
    public static void main (String[] args){
int [] arr ={1,1,0,1,0,1,0,0,1,0,1};

int x= arr.length;
int NoOfZeros = 0;


for(int i= 0 ; i<x ; i++){
    if (arr[i]==0){
        NoOfZeros++;   
    }
}
    for (int i=0; i<NoOfZeros; i++){
        arr[i]=0;
    }
    int ones = arr.length - NoOfZeros;

    for (int i= ones;i<arr.length ; i++ )
{
    arr[i]=1;
}
for (int ele: arr){
    System.out.print(ele+" ");
}
}
    }
    

