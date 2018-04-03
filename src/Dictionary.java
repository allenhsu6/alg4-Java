import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dictionary extends Frame implements ActionListener {
    String[] chinese;
    String[] english;
    int top;

    Label Lenglish, Lchinese;
    TextField tfEnglish, tfchinese;
    Button btLearn, btSearch;

    public static void main(String[] args) {
        Dictionary dc = new Dictionary();
        dc.show();
    }

    public Dictionary() {
        top = -1;
        chinese = new String[5];
        english = new String[5];
        Lenglish = new Label("英文");
        Lchinese = new Label("中文");
        tfchinese = new TextField(15);
        tfEnglish = new TextField(15);
        btLearn = new Button("learn");
        btSearch = new Button("Search ");

        setLayout(new FlowLayout());
        add(Lchinese);
        add(tfchinese);
        add(Lenglish);
        add(tfEnglish);
        add(btLearn);
        add(btSearch);

        btSearch.addActionListener(this);
        btLearn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btLearn)) {
            top++;
            english[top] = tfEnglish.getText();
            chinese[top] = tfchinese.getText();
        }
        if (e.getSource().equals(btSearch)){
            for (int i = 0; i<top; i++){
                if (english[i].equals(tfEnglish.getText())) {
                    tfchinese.setText(chinese[i]);
                    break;
                }
            }
        }

    }
}
