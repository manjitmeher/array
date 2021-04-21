public class array
 {
	public static void main(String[] args) 
	{
		int arr[][]={{2,6,8},{4,8,6},{4,6,9}};
		String str=	"All the Best";
		
		for(int a=0; a<3; a++)
		{
			for(int b=0;b<3;b++)
			{
				System.out.print(arr[a][b]);
			}
			System.out.println();
		}
		System.out.println(str);
	}
}
