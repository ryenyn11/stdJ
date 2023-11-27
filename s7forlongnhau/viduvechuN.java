package s7forlongnhau;

public class viduvechuN {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				System.out.print(i+""+j+"\t"); //nếu có ln thì hiển thị dọc
			}
			System.out.println(" ");// có dòng này thì kết quả là ngang, ngắt dòng
		}
		System.out.println(" "); //ilaf hàng dọc, j ngang
		System.out.println(" ");
		System.out.println(" ");
		//vẽ n thì j=1, j=7, i=j
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				if(j==1||j==7||i==j)
				//System.out.print(i+""+j+"\t"); //nếu đk đúng thì in kq
				System.out.print("*"+"\t");
				else 
					System.out.print(""+"\t"); //k thì in khoảng trắng
					//thcihs thích có thể sủa i,j thành dấu *
			}
			System.out.println(" ");
		}
		
		System.out.println(" "); //ilaf hàng dọc, j ngang
		System.out.println(" ");
		System.out.println(" ");
		
		//vẽ hình chữ nhật có viền 
		for(int i=1; i<=7;i++) {
			 for (int j=1; j<=7;j++) {
				 if (j==1||j==7||i==1||i==7)
					 System.out.print("*"+" ");
				 else
					 System.out.print(" "+" ");
			 }
			 System.out.println(" ");// để ngắt dòng xuống dòng để thành hình vuông, nếu không có ln sẽ thành đường thẳng ngang
		 }
		
		System.out.println(" "); //ilaf hàng dọc, j ngang
		System.out.println(" ");
		System.out.println(" ");
		
		// vẽ tam giác viền
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
			if(j==1||i==7||i==j)
				System.out.print(i+""+j+"\t"); //nếu có ln thì hiển thị dọc
			else
				System.out.print(" "+"\t");
			}
			System.out.println(" ");// có dòng này thì kết quả là ngang, ngắt dòng
		}

		System.out.println(" "); //ilaf hàng dọc, j ngang
		System.out.println(" ");
		System.out.println(" ");
		
		// vẽ tam giác full
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=i; j++) {// j<=i là j chỉ chạy tới i là dừng i=j
				System.out.print(i+""+j+"\t"); //nếu có ln thì hiển thị dọc
			}
			System.out.println(" ");// có dòng này thì kết quả là ngang, ngắt dòng	xuống dòng

}
		
		
		
		System.out.println(" "); //ilaf hàng dọc, j ngang
		System.out.println(" ");
		System.out.println(" ");
		
		
		// vẽ tam giác ngược
		for(int i=1; i<=7;i++) {
			for(int j=1; i<=7; j++) {
				if( j==1||i==i)
				System.out.print(j+""+i+"\t");
			}
			System.out.println(" "+" ");
		}


			
			
			
			
	
		

	}

}
