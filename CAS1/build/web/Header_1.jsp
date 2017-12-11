<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>

        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.theme.css">

        <link rel="stylesheet" type="text/css" href="Accordion.css">
            
<script type="text/javascript" src="../Admin/Script/UpdateSavedQuestions.js">
    </script>



        <style type="text/css">

            *
            {
                margin:0px;
                padding:0px;
            }

            #TopStrip
            {
                height:30px;
                background-color:skyblue;
                margin-bottom:20px;
            }

            table tr td
            {
                padding:5px;
            }

        </style>


        <script type="text/javascript" src="LatestJQuery.js">
        </script>

        <script type="text/javascript">

            $(document).ready
                    (
                            function ()
                            {

                                $("#accordion > li > div").click(function () {

                                    //if(false == $(this).next().is(':visible')) {
                                    //    $('#accordion ul').slideUp(300);
                                    //}

                                    $(this).next().slideToggle(300);
                                });

                            }

                    );

        </script>


    </head>

    <body>

        <div id="TopStrip">

        </div>

        <div class="container">

            <div class="panel panel-info" >
                <div class="panel-heading" style="height:80px;">

                    <h1 style="position:absolute">
                       PATHWAY COUNSELLING
                    </h1>

                    


                </div>	
            </div>

            <div class="row">

                <div class="col-sm-3">
                    <ul id="accordion">
                    <!--    <li><div>Courses><a href="AddCourse.jsp"></a>
                                ><a href="ListCourses.jsp">List Courses</a>
                                
                            </div>
                            
                        </li>

                       <li><div>Students><a href="AddStudent.jsp">Add Student</a>
                                ><a href="ListStudents.jsp">List Students</a>
                                
                            </div>
                            
                        </li>

              <!--                        <li><div>Departments</div>
          <li><div>Categories</div>
                            <ul>
                                <li><a href="../Admin/Category.jsp">Add Category</a></li>
                                <li><a href="../Admin/Categories.jsp">List Categories</a></li>

                            </ul>
                        </li>
                        <li><div>Tests</div>
                            <ul>
                                <li><a href="../Admin/Test.jsp">Add Test</a></li>
                                <li><a href="../Admin/Tests.jsp">List Tests</a></li>

                            </ul>
                        </li>-->

                      





                    </ul>
                </div>

                <div class="col-sm-12">
                    <div class="panel panel-danger">
                        <div class="panel-heading" style="background-color:#ffcccc;color:black">
