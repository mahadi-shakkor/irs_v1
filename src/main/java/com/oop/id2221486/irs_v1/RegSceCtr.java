package com.oop.id2221486.irs_v1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class RegSceCtr {
    HashMap<String,Subject> map =new HashMap<>();
    HashMap<Subject,Integer> map2 =new HashMap<>();
    ArrayList<String> s=new ArrayList<>();
    HashSet<String> hash = new HashSet<>();
    Subject s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    @FXML
    private TextArea textArea;

    public void initialize() {
        resultTextFild.setText("hello"+ "\n" +"yfyf");

        s1 = new Subject("CSE213","oop","Bc1200",
                "12:30-2:30",1);
        s2 = new Subject("CSE213","oop","Bc1200",
                "3:30-4:30",19);
        s3 = new Subject("CSE213","oop","Bc1200",
                "8:30-10:30",17);
        s4 = new Subject("CSE213","oop","Bc1200",
                "11:30-1:30",11);
        s5 = new Subject("CSE213","oop","Bc1200",
                "4:30-6:30",1);
        s6 = new Subject("CSE213","oop","Bc1400",
                "12:30-2:30",11);
        s7 = new Subject("CSE213","oop2","Bc100",
                "12:30-2:30",1);
        s8 = new Subject("CSE213","oop3","Bc12000",
                "12:30-2:30",13);
        s9 = new Subject("CSE213","oop11","Bc12300",
                "12:30-2:30",16);
        s10 = new Subject("CSE213","oop","Bc1200000",
                "12:30-2:30",10);

//
map.put(s1.toString(),s1);
        map.put(s2.toString(),s2);

        map.put(s3.toString(),s3);

        map.put(s4.toString(),s4);
        map.put(s5.toString(),s5);
        map.put(s6.toString(),s6);

        map.put(s7.toString(),s7);

        map.put(s8.toString(),s8);

        map.put(s9.toString(),s9);
        map.put(s10.toString(),s10);



        subjectCombowBox.getItems().addAll("hello demo",
                s1.toString(),s2.toString(),
                s3.toString(),s4.toString(),
                s5.toString(),s6.toString(),
                s7.toString(),s8.toString(),s9.toString(),s10.toString());
    }

    @FXML
    private TextField idTextFild;

    @FXML
    private TextField passwordTextfild;

    @FXML
    private TextField resultTextFild;

    @FXML
    private ComboBox<String> subjectCombowBox;


    @FXML
    void addButtonClick(ActionEvent event) {
        String key = subjectCombowBox.getValue();
        if (map.containsKey(key)) {
            Subject sk =map.get(key);
            textArea.setText(sk.toString());
            // Key exists, you can proceed with your logic here
        } else {
            textArea.setText("Not find in hash map now ");
            // Key does not exist
        }
    }




//        resultTextFild.clear();;
////        HashSet<String> hash = new HashSet<>();
//        if (s.size()>1){
//            for (String sk : s){
//                if(hash.add(subjectCombowBox.getValue())){
//                    s.add(subjectCombowBox.getValue());
//                    String l="";
//                    for (String sp:s ){
//                        l+=sp+"\n";
//
//                    }
//                    textArea.setText(l);
//
//                }
//                else {
//                    textArea.setText("Time clashing Choose Different time");
//                }
//
//            }
//        }
//        else{
//            s.add(subjectCombowBox.getValue());
//            hash.add(subjectCombowBox.getValue());
//            String l="";
//            for (String sp:s ){
//                l+=sp+"\n";
//
//            }
//            textArea.setText(l);
//        }












    @FXML
    void registerButton(ActionEvent event) {


    }

}
