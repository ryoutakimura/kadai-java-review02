
public class Review02 {

    public static void main(String[] args) {
        int i;
        boolean flag=true; //n倍判定フラグ
        //１から１００まで
        for(i = 1;i <= 100;i++) {
            //３倍判定のとき「Fizz」と出力する
            if(i % 3 == 0) {
                System.out.print("Fizz");
                flag=false;
            }
            //5倍判定のとき「Buzz」と出力する
            if(i % 5 == 0) {
                System.out.print("Buzz");
                flag=false;
            }
            //ｎ倍の判定に入らなかった場合整数を出力する
            if(flag) {
                System.out.print(i);
            }
            System.out.println(""); //改行
            flag=true; //ｎ倍判定リセット
        }
    }

}
