A failed Spring MVC project due to the Controller issue (maybe).
The issue is identified when the data cannot returned from controller to view (JSP file).

Suspect of issue: 
1. dispatcher servlet does not scanned controller. According to log, dispatcher servlet identified controller
2. Controller has incorrect URL. 
