<%@taglib uri="http://www.springframework.org/tags/form" prefix="sinu"%>
<sinu:form action="doRegister.form" method="post" commandName="r">
UserName:<sinu:input path="uname"/><sinu:errors path="uname"/><br>
Email:<sinu:input path="mail"/><sinu:errors path="mail"/><br>
Gender:<sinu:select path="gender">
<sinu:option value="">--Select Option---</sinu:option>
<sinu:option value="male">Male</sinu:option>
<sinu:option value="female">Female</sinu:option>
</sinu:select>
<sinu:errors path="gender"/><br>
Age:<sinu:input path="age"/><sinu:errors path="age"/><br>
DateOfBirth:<sinu:input path="dateOfBirth" placeholder="dd/mm/yyyy"/><sinu:errors path="dateOfBirth"/><br>
<input type=submit value="submit">
</sinu:form>

