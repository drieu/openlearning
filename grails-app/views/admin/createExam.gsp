<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>

</head>
<body>

<p>MESSAGE : ${message}</p>
List des examens :
<table>
<tr>
    <th>Nom de l'examen</th>
    <th>Question</th>
    <th>Choices (solutions)</th>
</tr>
<g:each in="${qcm}">
    <tr>
        <td>${qcm.name}</td>
    <g:each in="${qcm.questions}" var="question">
            <td>${question.text}</td>
            <td>${question.choices}
            (${question.solutions})</td>
    </g:each>
    </tr>
</g:each>

</table>

</body>
