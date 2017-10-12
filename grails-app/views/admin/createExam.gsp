<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>

</head>
<body>

<p>MESSAGE : ${message}</p>


<g:form controller="admin" action="createExam">
    <input type="hidden" name="adm_ce_form" value="FORM"/>
    <table>
        <tr>
            <td>Nom du test</td>
            <td><g:textField name="qcmName" value="titi"/></td>
        </tr>
        <tr>
            <td>Votre question :</td>
            <td><g:textField name="ask" value="question ?"/></td>
        </tr>
        <tr>
            <td>Choix 1 :</td>
            <td><g:textField name="choice1" value="test">Choix 1 :</g:textField></td>
        </tr>
        <tr>
            <td>Choix 2 :</td>
            <td><g:textField name="choice2" value="test 2">Choix 2 :</g:textField></td>
        </tr>
        <tr>
            <td>Choix 3 :</td>
            <td><g:textField name="choice3" value="a">Choix 3 :</g:textField></td>
        </tr>
        <tr>
            <td>Solution :</td>
            <td><g:textField name="solution" value="sol">Solution :</g:textField></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>

</g:form>

List des examens :
<table>
<tr>
    <th>Nom de l'examen</th>
    <th>Question</th>
    <th>Choices (solutions)</th>
</tr>
<g:each in="${qcm}">
    <tr>
        <td>A${qcm.name}</td>
    <g:each in="${qcm.questions}" var="question">
            <td>${question.text}</td>
            <td>${question.choices}
            (${question.solutions})</td>
    </g:each>
    </tr>
</g:each>

</table>

</body>
