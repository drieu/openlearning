<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <titl</title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>

</head>
<body>

    <g:form controller="QCM" action="check">

        <table>
            <tr><p>Question</p></tr>
            <tr>
                <td><g:checkBox name="ck1" /></td>
                <td>Solution 1</td>
            </tr>
            <tr>
                <td><g:checkBox name="ck2" /></td>
                <td>Solution 2</td>
            </tr>
            <tr>
                <td><g:checkBox name="ck3" /></td>
                <td>Solution 3</td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table>

    </g:form>

</body>