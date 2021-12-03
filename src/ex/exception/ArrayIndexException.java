package ex.exception;

public class ArrayIndexException {
    public static void main(String[] args) {
        int n[] = {1,30,72};
        System.out.println("開始");
        try{
            for (int i = 0; i < 4; i++){
                System.out.println(n[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("配列の範囲を超えています");
        }finally {
            System.out.println("終了");
        }
    }
}
