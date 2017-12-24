package solution;

public class binarySearch {
	public int binarySelect(int[] num,int[]  target) {
		  int length=num.length;
		  int pos=length/2;
		  if(num[0]>target||num[length-1]<target) {
			  return -1;
		  }
		  while(num[pos]>target) {
			  pos=pos/2;
		  }
		  for(int j=pos;j<=pos*2;j++) {
			  if(num[j]==target) {
				  pos=j;
				  break;
			  }
			  if((j==pos*2)&&(num[j]!=target)) {
				  return -1;
			  }
		  }
		  while((pos>=1)&&(num[pos]==num[pos-1])) {
			  pos--;
		  }
		  return pos;
	}
}
