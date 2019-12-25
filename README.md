# Programmer's day


Build and Run

        gradle build
        gradle bootRun
Examples

        request: http://localhost:8080/?year=1999
        response: {"errorCode":200,"dataMessage":"13/09/99"}
  
        request: http://localhost:8080/?year=2000
        response: {"errorCode":200,"dataMessage":"12/09/00"}
        
        request: http://localhost:8080/?year=2017
        response: {"errorCode":200,"dataMessage":"13/09/17"}
