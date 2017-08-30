<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <g:message code="course.index.title"/>

    <g:each in="${courses}" var="course">
        <p>${course?.name}</p>
    </g:each>
</body>
