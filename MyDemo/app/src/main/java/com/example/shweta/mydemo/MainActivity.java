package com.example.shweta.mydemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private Button btnFullscreenAd;
    String str_duplicate[] = {"1", "2", "2", "3", "5"};
    static int firstValue=60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("E8BCEFC40068C63BD18F1F9DCA661500")
                .build();
        mAdView.loadAd(adRequest);
        btnFullscreenAd = (Button) findViewById(R.id.btn_fullscreen_ad);
        btnFullscreenAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
//        find Duplicate Element in Array
        findDuplicateElement(str_duplicate);
        findDuplicateElementByHashset(str_duplicate);
        switchCase(20);
        forLoop();
        lebelForLoop();
        breakStatement();
        fibonacci();
        staticMethod();
        staticMethod("Static Method");
        sum(2,3);
        sum(2,3,4);
//        Constructor
        new DemoConstructor();
        DemoConstructor d= new DemoConstructor(12,"Sweta");
        d.display();
//        This
        DemoThis demoThis=new DemoThis(12,"Sweta Gupta");
        demoThis.display();
        DemoThis demoWithThis=new DemoThis(13,"Rani","Gupta");
        demoWithThis.show();
//        Inheritance
        InheritanceDemo inheritanceDemo=new InheritanceDemo();
        System.out.println("Inheritance"+inheritanceDemo.bonus +inheritanceDemo.salary);

//    Aggegation
        Address address=new Address("Jhansi","UP","India");
        InheritanceDemo inheritanceDemo1=new InheritanceDemo(1,"Priya",address);
        inheritanceDemo1.displayAggeration();
//Override
        Bike2 bike2=new Bike2();
        bike2.run();

//        Super
        Bike3 bike3=new Bike3();
        bike3.display();

    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }

    public void findDuplicateElement(String str_duplicate[]) {
        for (int i = 0; i < str_duplicate.length; i++) {
            for (int j = 0; j < str_duplicate.length; j++) {
                if (str_duplicate[i].equals(str_duplicate[j]) && i != j) {
                    System.out.println("Duplicate Element " + str_duplicate[i]);
                }
            }
        }
    }

    public void findDuplicateElementByHashset(String str_duplicate[]) {
        HashSet<String> hashset = new HashSet<String>();
        for (String str : str_duplicate) {
            if (!hashset.add(str)) {
                System.out.println("Duplicate Element By Using Hashset" + str);
            }
        }


    }

    public void switchCase(int number) {
        switch (number) {
            case 10:
                System.out.println("Switch" + "10");
                break;
            case 20:
                System.out.println("Switch" + "20");

            case 30:
                System.out.println("Switch" + "30");
                break;
            default:
                System.out.println("did not match any one of them");
        }
    }

    public void forLoop() {
        for (int i = 1; i < 10; i++) {
            System.out.println("For Loop" + i);
        }

    }

    public void lebelForLoop() {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println("Lebel For Loop" + i + "" + j);
            }
        }
    }

    public void whileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println("while loop" + i);
            i++;
        }
    }

    public void breakStatement() {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("Break :" + i);
        }
    }

    public void fibonacci() {

        int n1=0,n2=1,n3,i,count=10;

        System.out.print("hh"+n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

    }


    }
    public void intanceVariable(){
        int count=0;
        

    }
    public static void displayShow(){
        System.out.println("Call Static Variable");
    }
    static {
        System.out.println("First Static Block");
    }
    static {
        System.out.println("Second Static Block");
    }
    static {
        System.out.println("Third Static Block");
    }

   public static void staticMethod(){
       System.out.println("Static Method :"+"Zero Argument");
   }
    public static void staticMethod(String strName){
        System.out.println("Static Method :"+"One Argument");
    }

//    Method Over loading

    public void sum(int a,int b){
        int c=a+b;
        System.out.println("Overloading :"+c);
    }
    public void sum(int a,int b ,int c)
    {
        int d=a+b+c;
      System.out.println("Overloading :"+d);
    }

//    Overloaded Constructor


}
