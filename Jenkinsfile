pipeline{

    agent any
     tools{
        maven "myMaven"
    }


     stages{

         stage("Build"){

                 steps{
                     echo"Building the application"
                     bat "mvn clean install"
                 }
          }

         stage("Test"){

               steps{
                 echo "Running the surefire tests"
                    bat "mvn clean package"
                 bat "mvn test"
               }

         }

          stage("Issue surefire report"){

                             steps{
                               echo "Generating report..."
                             }

          }

        

         

          stage("Deploy"){

                     steps{

                      echo "Deploying Application..."
                    }

              }

         }

    }
