import java.awt.*;
import java.awt.event.*;
public class RegistrationForm extends Frame {
Label titleLabel, nameLabel, genderLabel, aadharLabel1, aadharLabel2,
motherLabel, fatherLabel, occupationLabel, dobLabel, bloodGroupLabel,
nationalityLabel, addressLabel, telephoneLabel, mobileLabel, emailLabel,
educationLabel;
TextField nameField, aadharField1, aadharField2, motherField,
fatherField, occupationField, dobField, bloodGroupField,
nationalityField, telephoneField, mobileField, emailField, casteField;
Choice genderChoice, categoryChoice;
TextArea addressArea, educationArea;
Button submitButton, cancelButton;
public RegistrationForm() {
setLayout(null);
setBackground(Color.LIGHT_GRAY);
Font titleFont = new Font("arial", Font.BOLD, 25);
titleLabel = new Label("REGISTRATION FORM");
titleLabel.setBounds(200, 30, 400, 40);
titleLabel.setForeground(Color.BLACK);
titleLabel.setFont(titleFont);
nameLabel = new Label("1. NAME OF THE CANDIDATE (CAPITALS. As per SSC)");
nameLabel.setBounds(50, 80, 300, 20);
nameField = new TextField(10);
nameField.setBounds(400, 80, 250, 20);
genderLabel = new Label("2. GENDER");
genderLabel.setBounds(50, 110, 300, 20);
genderChoice = new Choice();
genderChoice.add("MALE");
genderChoice.add("FEMALE");
genderChoice.setBounds(400, 110, 250, 20);
aadharLabel1 = new Label("3. AADHAAR NUMBER");
aadharLabel1.setBounds(50, 140, 300, 20);
aadharField1 = new TextField(10);
aadharField1.setBounds(400, 140, 250, 20);
motherLabel = new Label("4. NAME OF THE MOTHER");
motherLabel.setBounds(50, 170, 300, 20);
motherField = new TextField(10);
motherField.setBounds(400, 170, 250, 20);
aadharLabel2 = new Label("5. AADHAAR NUMBER");
aadharLabel2.setBounds(50, 200, 300, 20);
aadharField2 = new TextField(10);
aadharField2.setBounds(400, 200, 250, 20);
fatherLabel = new Label("6. NAME OF THE FATHER/GUARDIAN");
fatherLabel.setBounds(50, 230, 300, 20);
fatherField = new TextField(10);
fatherField.setBounds(400, 230, 250, 20);
occupationLabel = new Label("7. OCCUPATION & ANNUAL INCOME OF THE PARENT");
occupationLabel.setBounds(50, 260, 300, 20);
occupationField = new TextField(10);
occupationField.setBounds(400, 260, 250, 20);
dobLabel = new Label("8. DATE OF BIRTH DD/MM/YYYY");
dobLabel.setBounds(50, 290, 300, 20);
dobField = new TextField(10);
dobField.setBounds(400, 290, 250, 20);
bloodGroupLabel = new Label("9. BLOOD GROUP");
bloodGroupLabel.setBounds(50, 320, 300, 20);
bloodGroupField = new TextField(10);
bloodGroupField.setBounds(400, 320, 250, 20);
nationalityLabel = new Label("10. NATIONALITY & RELIGION");
nationalityLabel.setBounds(50, 350, 300, 20);
nationalityField = new TextField(10);
nationalityField.setBounds(400, 350, 250, 20);
Label categoryLabel = new Label("11. CATEGORY OF RESERVATION");
categoryLabel.setBounds(50, 380, 300, 20);
categoryChoice = new Choice();
categoryChoice.add("OC");
categoryChoice.add("SC");
categoryChoice.add("ST");
categoryChoice.add("BC-A");
categoryChoice.add("BC-B");
categoryChoice.add("BC-C");
categoryChoice.add("BC-D");
categoryChoice.add("BC-E");
categoryChoice.setBounds(400, 380, 250, 20);
Label casteLabel = new Label("CASTE:");
casteLabel.setBounds(50, 410, 300, 20);
casteField = new TextField(10);
casteField.setBounds(400, 410, 250, 20);
addressLabel = new Label("12. ADDRESS FOR COMMUNICATION");
addressLabel.setBounds(50, 440, 300, 20);
addressArea = new TextArea(5, 10);
addressArea.setBounds(400, 440, 250, 90);
telephoneLabel = new Label("13. TELEPHONE NO.");
telephoneLabel.setBounds(50, 550, 300, 20);
telephoneField = new TextField(10);
telephoneField.setBounds(400, 550, 250, 20);
mobileLabel = new Label("14. MOBILE NUMBERS");
mobileLabel.setBounds(50, 580, 300, 20);
mobileField = new TextField(10);
mobileField.setBounds(400, 580, 250, 20);
emailLabel = new Label("15. E-MAIL ID");
emailLabel.setBounds(50, 610, 300, 20);
emailField = new TextField(10);
emailField.setBounds(400, 610, 250, 20);
educationLabel = new Label("16. EDUCATIONAL QUALIFICATIONS");
educationLabel.setBounds(50, 640, 300, 20);
educationArea = new TextArea(5, 10);
educationArea.setBounds(400, 640, 250, 90);
submitButton = new Button("Submit");
submitButton.setBounds(220, 750, 80, 30);
submitButton.setBackground(Color.BLACK);
submitButton.setForeground(Color.WHITE);
cancelButton = new Button("Cancel");
cancelButton.setBounds(320, 750, 80, 30);
cancelButton.setBackground(Color.BLACK);
cancelButton.setForeground(Color.WHITE);
add(titleLabel);
add(nameLabel);
add(nameField);
add(genderLabel);
add(genderChoice);
add(aadharLabel1);
add(aadharField1);
add(motherLabel);
add(motherField);
add(aadharLabel2);
add(aadharField2);
add(fatherLabel);
add(fatherField);
add(occupationLabel);
add(occupationField);
add(dobLabel);
add(dobField);
add(bloodGroupLabel);
add(bloodGroupField);
add(nationalityLabel);
add(nationalityField);
add(categoryLabel);
add(categoryChoice);
add(casteLabel);
add(casteField);
add(addressLabel);
add(addressArea);
add(telephoneLabel);
add(telephoneField);
add(mobileLabel);
add(mobileField);
add(emailLabel);
add(emailField);
add(educationLabel);
add(educationArea);
add(submitButton);
add(cancelButton);
setTitle("MOTHER THERESA INSTITUTE OF COMPUTER APPLICATIONS");
setSize(700, 800);
setVisible(true);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent windowEvent) {
System.exit(0);
}
});
}
public static void main(String[] args) {
new RegistrationForm();
}
}


