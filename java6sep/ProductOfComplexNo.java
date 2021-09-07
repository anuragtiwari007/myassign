package MyFirstJavaProgram;

public class ProductOfComplexNo {
		int real;
		int imag;
		public ProductOfComplexNo(int r,int i) {
			real=r;
			imag=i;
		}
		public static ProductOfComplexNo add(ProductOfComplexNo a,ProductOfComplexNo b) {
			return new ProductOfComplexNo((a.real+b.real),(a.imag+b.imag));
		}
		public static ProductOfComplexNo diff(ProductOfComplexNo a,ProductOfComplexNo b) {
			return new
					ProductOfComplexNo((a.real-b.real),(a.imag-b.imag));
		}
		public static ProductOfComplexNo product(ProductOfComplexNo a,ProductOfComplexNo b) {
			return new
					ProductOfComplexNo(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.real)));
		}
		public void printComplex() {
			if(real==0&&imag!=0) {
				System.out.println(imag+"i");
			}
			else if(imag==0&&real!=0);
			else {
				System.out.println(real+"+"+imag+"i");
			}
		}
	}
	class Ans{
		public static void main(String[]args)
		{
			ProductOfComplexNo c=new ProductOfComplexNo(4,5);
			ProductOfComplexNo d=new ProductOfComplexNo(9,4);
			ProductOfComplexNo e=ProductOfComplexNo.add(c,d);
			ProductOfComplexNo f=ProductOfComplexNo.diff(c,d);
			ProductOfComplexNo g=ProductOfComplexNo.product(c,d);
			
			e.printComplex();
			f.printComplex();
			g.printComplex();
		}
	}

