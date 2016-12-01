<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Профиль</title>

    <link href="/css/style.css" rel="stylesheet">
    <link href="/css/menu.css" rel="stylesheet">
    <link href="/css/news_item.css" rel="stylesheet">
    <link href="/css/profile.css" rel="stylesheet">

    <script src="/js/jquery.min.js"></script>
    <script src="/js/feed.js"></script>
</head>
<body>
<div class="container">

<#include "header.ftl">
<#include "menu.ftl">

    <div class="center-content">
        <div class="container">
            <div class="title">Профиль</div>
            <div style="height: 0"><img src="../images/no_photo2.png"/></div>
            <div class="user-info">${user.getSurname()}</div>
            <div class="user-info">${user.getName()}</div>
            <div class="user-info">${user.getPatronymic()}</div>
            <div class="user-info">${user.getOtryad()}</div>
            <div class="user-info">${user.getPhoneNumber()}</div>
            <div class="user-info">${user.getEmail()}</div>
            <div class="user-info">${user.getDolshnost()}</div>

            <div class="divider"></div>

            <form id="new_feed" class="news_item" action="" method="post">
                <input name="action" value="new_feed_item" type="hidden">
                <label>Ваша новость:
                    <textarea class="news_item_input" name="text"></textarea>
                </label>
                <input class="button_add_news_item" type="submit"/>
            </form>

            <div id="news_container">

            </div>

</body>
</html>