<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title><g:message code="course.index.title"/></title>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <g:message code="course.index.title"/>

    <g:each in="${courses}" var="course">
        <p><g:link controller="Lesson" action="show" params="[name: course?.name ]">${course?.name}</g:link></p>
    </g:each>
</body>
