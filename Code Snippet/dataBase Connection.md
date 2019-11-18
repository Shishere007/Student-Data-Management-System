H2 embedded database
#
To establish Connection ::

{database} - replace it with your database Name without curly braces

```
    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/{database name}";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    public static Connection con = null;
    public static String sql = null;
    public static PreparedStatement pst = null;
```
#
Create Table ::

example Table Creation Query

it is best to create it like this
```
public static final String Create_Table_Student = "create table student( adno int(6) primary key,\n"
            + "rollno int(2) not null,\n"
            + "name varchar(25) not null,\n"
            + "sex varchar(6) not null default 'Male',\n"
            + "dept varchar(5) not null,\n"
            + "sem int(1) not null check(sem>0),\n"
            + "dob date,\n")";
```
#
Table Creation

it is recommended to close the database once need is satisfied{using con.close();}
```
public void createTable(){
    try {
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);  
        pst = con.prepareStatement(Create_Table_User);
        pst.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();
}
```
#
Delete Table ::

to drop the table of name student
```
public void deleteTable(){
    try {
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);  
        pst = con.prepareStatement("drop table student");
        pst.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();
}
```
#
Insert Data into the Table ::

assume these variable have the following data
date data will be automatically converted when inserting if the format is correct

```
Straing name = 'abcd';
int adno = '1234';
int rollno = '2';
String sex = 'Male';
String dept = 'CSE';
String dob = '1998-1-1';
```

Insert the above mentioned data into the table 'student'

no of '?' = no of columns in your table

or

no of '?' = no of columns you are inserting data into

```
public void insertData(){
    try{
        Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        String sql = "insert into student values(?,?,?,?,?,?,?)";
        pst = con.prepareStatement(sql);
        // order of the following statement is important
        // it must be same as the columns in your table
        // the order you specify during creating command
        pst.setString(1,adno);
        pst.setString(2,rollno);
        pst.setString(3,name);
        pst.setString(4,sex);
        pst.setString(5,dept);
        pst.setString(6,dob);
        pst.executeUpdate();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();
}
```
#
Select Data From Table

```
public void showTableData(){
    try{
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        String sql = "select * from student";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            // this order is also important
            // this must be same as the columns in your table
            // or the order you specified while writing code
            int adno = rs.getString(1);
            int rollno = rs.getString(2);
            Straing name = rs.getString(3);
            String sex = rs.getString(4);
            String dept = rs.getString(5);
            String dob = rs.getString(6);
        }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();
    }
}
```
#

All sql command can be executed using the above mentioned ways.

There are mainly 4 states

state 1 : You provide no data and recieve no data while execution
```
    try {
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);  
        String sql = "{sql commands}";
        pst = con.prepareStatement(sql);
        pst.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();

```
state 2 : you provide no data but recieve data after execution

```
    try {
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);  
        String sql = "{sql commands}";
        pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            // program will only execute these code within while if there is a row
            // accessing row by row by using the following command
            var = rs.getString({column number)
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();
```

state 3 : you provide data while execution but recieve nothing

```
    try {
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);  
        String sql = "{sql commands}";
        pst = con.prepareStatement(sql);
        pst.setString(1,{value});
        pst.setString(2,{value});
        .
        .
        .
        pst.execute();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();
```

state 4 : you provide data and also recieve data after execution

```
    try {
        con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);  
        String sql = "{sql commands}";
        pst = con.prepareStatement(sql);
        pst.setString(1,{value});
        pst.setString(2,{value});
        .
        .
        .
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            // program will only execute these code within while if there is a row
            // accessing row by row by using the following command
            var = rs.getString({column number)
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    con.close();
```

