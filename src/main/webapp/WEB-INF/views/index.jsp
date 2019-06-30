<%--
  Created by IntelliJ IDEA.
  User: hieuthao
  Date: 30/06/19
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h1>Caculator</h1>
  <form method="post" action="result">
    <table>
    <tr>
      <td>
    <input type="number" name="firstNumber"/>
      </td>
      <td>
    <input type="number" name="secondNumber"/>
      </td>
    </tr>
    <tr>
      <td>
    <input type="submit" name="Conculator" value="Addition(+)"/>
      </td>
      <td>
        <input type="submit" name="Conculator" value="Subtraction(-)"/>
      </td>
      <td>
        <input type="submit" name="Conculator" value="Multiplication(x)"/>
      </td>
      <td>
        <input type="submit" name="Conculator" value="Division(/)"/>
      </td>
    </tr>
    </table>
  </form>
  </body>
</html>
