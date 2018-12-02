package Demo1;

import java.util.Random;

/**
 * 文档注释的使用,
 * 将自己的工具类编译成API文档,编译DOS命令为:javadoc -encoding utf-8 -d api -version -author ArrayUtil.java
 * @author lily
 * @version v1.0
 * */
public class ArrayUtil {
	/**
	 * 本类中所有方法都是静态的,所有要私有化构造方法,避免其他类创建本类对象
	 *静态方法直接由类名.方法名 调用
	 */
	public ArrayUtil() {
	}

	/**
	 * 这是获取数组最大元素值的方法
	 * @param arr 接收一个数组
	 * @return 返回一个最大值
	 * */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * 以空间换时间,把原数组的值作为新数组的索引,
	 * 将新数组中该索引位置的元素加一,
	 *找到数组元素为2的索引值,在旧数组此索引处就是重复的元素
	 * @param arr 接收一个数组
	 */
	public static void getEle(int[] arr) {
		int[] newArr = new int[100];
		for(int x=0; x<arr.length; x++) {
			newArr[arr[x]]++;
			if(newArr[arr[x]]==2) {
				System.out.println("重复的元素是:"+arr[x]);
				break;
			}
		}
	}

	/**
	 * 查看数组
	 * @param arr 接收一个数组
	 */
	public static void showArr(int[] arr) {
			int count = 0;
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[j]+"\t");
				if(++count%10==0) {
					System.out.println();
				}
			}
			System.out.println();
		}

	/**
	 * 将数组打乱顺序
	 * @param arr 接收一个数组
	 */
	public static void randomArr(int[] arr) {
		for(int k=0;k<1000;k++){
			Random r = new Random();
			int i = r.nextInt(100);
			int j = r.nextInt(100);
			int temp =arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
