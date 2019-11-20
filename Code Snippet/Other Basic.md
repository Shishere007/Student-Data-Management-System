#

To recieve data from a textField ::

```
String var_name = textField.getText();
```

To set data to textfield ::

```
textField.setText(var_name);
```

Make Textfield unedittable

```
textField.setEnabled(false);
```

#
Radio Button

To get if button selected or not

returns true or false
```
var var_name = radio_button.isSelected()
```

make one button selected by default

```
radio_button.setSelected(true);
```

#

ComboBOx

make none selected mode
```
combo_box.setSelectedIndex(-1);
```

make specific value selected
```
combo_box.setSelectedIndex({index number});
or
combo_box.setSelectedItem({data});

```
#
JTable Data Inserttion


step 1 - Drage and drop a table to the frame and give it a variable name
step 2 - right click and goto ->  

table contents->value from existing component->choode tableaname->getmodel()

step 3 - Model Creation

{Table Variable Name} : replace it with suitable table name
```
DefaultTableModel model = (DefaultTableModel) {Table Variable Name}.getModel();
```

step 4 : Add columns (As much needed)
```
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Admission No");
        model.addColumn("RollNo");
        model.addColumn("Name");
```
step 4 : data insertion
```
        model.addRow(new Object[]{"1234","12","abcd",})
```

#
insert data into JTable from Database

Data insertion order is importantS

full code : (for taking data from student database table and inserting into JTable of name dataBaseT)
```
        DefaultTableModel model = (DefaultTableModel) dataBaseT.getModel();
        // Setting row and column count zero to avoid unwanted row and 
        // columns while creation of the tableS
        model.setRowCount(0);
        model.setColumnCount(0);
        // adding columns as much as neededS
        model.addColumn("Admission No");
        model.addColumn("RollNo");
        model.addColumn("Name");
        model.addColumn("Sex");
        model.addColumn("Department");
        model.addColumn("Semester");
        model.addColumn("DOB");
        model.addColumn("Email");
        model.addColumn("Phone");
        // fetching data from DB and inserting into Jtable
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            // 'student' is the table name
            sql = "select * from student";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
```