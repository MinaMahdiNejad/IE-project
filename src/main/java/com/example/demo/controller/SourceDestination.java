package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SourceDestination {
    @GetMapping("/flight")
    public String flight(@RequestParam(value = "ori",defaultValue = "default") String S,
                         @RequestParam(value = "des",defaultValue = "default") String D){
            String source = " ";
            String destination = " ";

            if (S.equals("تهران") && D.equals("مشهد")) {
                source = "تهران";
                destination = "مشهد";

            }

            else if (S.equals("تهران") && D.equals("بیرجند")) {
                source = "تهران";
                destination = "بیرجند";
            }

            else if (S.equals("مشهد") && D.equals("تهران")) {
                source = "مشهد";
                destination = "تهران";
            }

            else if (S.equals("مشهد") && D.equals("بیرجند")) {
                source = "مشهد";
                destination = "بیرجند";
            }

            else if (S.equals("بیرجند") && D.equals("تهران")) {
                source = "بیرجند";
                destination = "تهران";
            }

            else {
                source = "بیرجند";
                destination = "مشهد";
            }

        String page=    "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n"+
                " <meta charset=\"UTF-8\">\n"+
                " <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"+
                " <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"+
                "<link rel=\"stylesheet\" href=\"TehranToMashhad.css\">\n"+
                "<title>TehranToMashhad</title>\n"+
                "<link rel=\"icon\" type=\"image/x-icon\" href=\"favicon.ico\"/>\n"+
                " </head>\n"+
                "<style>\n"+
                "body {"+
                "font-family: Tahoma, Geneva, sans-serif;"+
                /* direction: rtl; */
                "font-size: 13px;"+
                " }"+
                "@font-face {"+
                "font-family: 'Vazir-Regular-FD';"+
                " src: url('http://example.com/fonts/Vazir-Regular-FD.eot');"+
                "src: local('Vazir-Regular-FD'),"+
                " url('http://example.com/fonts/Vazir-Regular-FD.eot?#iefix') format('embedded-opentype'),"+
                "url('http://example.com/fonts/Vazir-Regular-FD.woff2') format('woff2'),"+
                "url('http://example.com/fonts/Vazir-Regular-FD.woff') format('woff'),"+
                "url('http://example.com/fonts/Vazir-Regular-FD.ttf') format('truetype'),"+
                "url('http://example.com/fonts/Vazir-Regular-FD.svg#Vazir-Regular-FD') format('svg');"+
                "font-style: normal;"+
                "font-weight: normal;"+
                " font-display: swap;"+
                " }"+

                "body{"+
                "background: linear-gradient(rgba(15,132,250,1),rgba(255,255,255,0.5));"+
                "}"+
                ".row1{"+
                "border: 4px solid #ffda73;"+
                "border-radius: 10px;"+
                "background-color: white;"+
                "padding: 20px;"+
                "width: 718px;"+
                "height: 174px;"+
                "margin-left: auto;"+
                "margin-right:auto;"+
                "display: flex;"+
                "}"+
                ".row2{"+
                "border: 4px solid #ffda73;"+
                "border-radius: 10px;"+
                "background-color: white;"+
                "padding: 20px;"+
                "width: 718px;"+
                "height: 174px;"+
                "margin-left: auto;"+
                "margin-right:auto;"+
                "display: flex;"+
                "}"+
                ".row3{"+
                "border: 4px solid #ffda73;"+
                "border-radius: 10px;"+
                "background-color: white;"+
                "padding: 20px;"+
                "width: 718px;"+
                "height: 174px;"+
                "margin-left: auto;"+
                "margin-right:auto;"+
                "display: flex;"+
                "}"+
                ".spacer{"+
                "width: 718px;"+
                "height: 10px;"+
                "margin-left: auto;"+
                "margin-right:auto;"+
                "}"+
                ".select{"+
                "padding: 10px;"+
                "}"+
                ".select button{"+
                "padding: 20px;"+
                "color: white;"+
                "background-color: #0f84fa;"+
                "border:#0f84fa;"+
                "border-radius: 10px;"+
                "}"+
                ".inline{"+
                "justify-content: center;"+
                "align-items: center;"+
                "display: flex;"+
                "padding: 30px;"+
                "}"+
                ".photo{"+
                "display: flex;"+
                "justify-content: center;"+
                "align-items: center;"+
                "padding: 40px;"+
                "}"+
                ".photo img{"+
                /* padding: 50px; */
                "height: auto;"+
                "background-position: center;"+
                "display: flex;"+
                "justify-content: center;"+
                "align-items: center;"+
                "}"+
                ".photo span  {"+
                "color: black;"+
                "font-size: 20px;"+
                "font-family: Vazir-Regular-FD, Tahoma, Geneva, sans-serif;"+
                /* padding: 30px; */
                "}"+
                ".box{"+
                /* border: 2px purple solid; */
                "width: 24px;"+
                "height: 100px;"+
                /* padding: 87px; */
                "margin-left: auto;"+
                "margin-right:auto;"+
                "}"+

                " </style>"+
                " <body>"+
                "<div class=\"row1\"> \n" +
                                    "<div>"+
                                      "  <div class=\"select\">"+
                                           " <p>"+
                                                    "قیمت: 729,500 تومان"+
                                                    "</p><br>"+
                                            "<button>انتخاب پرواز</button><br>"+
                                            "<p>"+
                                                        " ظرفیت خالی: 10+ صندلی" +
                                                        "</p><br>"+
                                        "</div>"+
                                    "</div>"+

                                    "<div class=\"box\"></div>"+

                                    "<div class=\"inline\">"+
                                       " <div>"+
                                                  "  8:15 <br>"+
                                             "" + destination + "" +
                                        "</div>"+
                                       " <div>"+
                                           " <========================"+
                                        "</div>"+
                                        "<div>"+
                                                 "  6:50 <br>"+
                                                "" + source + "" +
                                        "</div>"+
                                   " </div>"+

                                   " <div class=\"photo\">"+
                                       " <span> &nbsp; &nbsp; &nbsp; هما</span>"+
                                        "<img src=\"Iranair_logo.jpg\" width=\"50\" height=\"50\"><br><br>"+
                                    "</div>"+

                                "</div>"+

                                "<div class=\"spacer\"></div>"+
                                "<div class=\"row2\">"+
                                  "  <div>"+
                                        "<div class=\"select\">"+
                                           " <p>"+
                                                   " قیمت: 735,300 تومان"+
                                                    "</p><br>"+
                                            "<button>انتخاب پرواز</button><br>"+
                                            "<p>"+
                                                       " ظرفیت خالی: 9+ صندلی"+
                                                       " </p><br>"+
                                       " </div>"+
                                    "</div>"+

                                    "<div class=\"box\"></div>"+

                                    "<div class=\"inline\">"+
                                       " <div>"+
                                                      "  17:00 <br>"+
                                                      "" + destination + "" +
                                       " </div>"+
                                        "<div>"+
                                          "  <======================="+
                                       " </div>"+
                                        "<div>"+
                                                   " 15:30 <br>"+
                                                     "" + source + "" +
                                         "</div>"+
                                    "</div>"+

                                    "<div class=\"photo\">"+
                                       " <span> سپهران</span>"+
                                        "<img src=\"images.png\" width=\"50\" height=\"50\"><br><br>"+
                                    "</div>"+
                                "</div>"+

                                "<div class=\"spacer\"></div>"+
                                "<div class=\"row3\">"+
                                    "<div>"+
                                        "<div class=\"select\">"+
                                            "<p>"+
                                                   " قیمت: 751,500 تومان" +
                                                    "</p><br>"+
                                            "<button>انتخاب پرواز</button><br>"+
                                            "<p>"+
                                                    "ظرفیت خالی: 2+ صندلی" +
                                                   " </p><br>"+
                                        "</div>"+
                                    "</div>"+

                                   " <div class=\"box\"></div>"+

                                   " <div class=\"inline\">"+
                                       " <div>"+
                                                "17:15 <br>"+
                                                "" + destination + "" +
                                       " </div>"+
                                       " <div>"+
                                          "  <======================="+
                                        "</div>"+
                                       " <div>"+
                                                    "16:00 <br>"+
                                                     "" + source + "" +
                                       " </div>"+
                "</div>"+

                        "<div class=\"photo\">"+
                " <span>ماهان</span> &nbsp;"+
                "<img src=\"mahan.jpg\" width=\"50\" height=\"50\"><br><br>"+
                "</div>"+

                "</div>"+
                "<div class=\"spacer\"></div>"+
                "<div class=\"spacer\"></div>"+

                "</body>"+
                "</html>";


        return page;
    }
}


















