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
