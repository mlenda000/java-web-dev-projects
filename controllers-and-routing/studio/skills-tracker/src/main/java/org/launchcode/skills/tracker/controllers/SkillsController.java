package org.launchcode.skills.tracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@ResponseBody
@RequestMapping
public class SkillsController {
    @GetMapping()
    public String indexPage(){
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "<a href='/form'>Goto Form</a>" +
                "</body>" +
                "</html>";

        return html;

    }
    @GetMapping("form")
    public String formPage() {
        return "<html>" +
                "<body>" +
                "<form action='skills' method='post'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' id='name' name='name''><br>" +
                "<label for='language1'>My favorite language:</label><br>" +
                "<select id='language1' name='language1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<label for='language2'>My second favorite language:</label><br>" +
                "<select id='language2' name='language2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<label for='language3'>My third favorite language:</label><br>" +
                "<select id='language3' name='language3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='C++'>C++</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

//    @RequestMapping(value="skills",method = RequestMethod.POST)
//    public String helloPost(@RequestParam String name, @RequestParam String language1,
//                            @RequestParam String language2, @RequestParam String language3) {
//        if (name == null || name.isEmpty()) {
//            name = "User123";
//        }
//        return "<html>" +
//                "<body>" +
//                "<h1>" + name + "</h1>" +
//                "<ol>" +
//                "<li>" + language1 + "</li>" +
//                "<li>" + language2 + "</li>" +
//                "<li>" + language3 + "</li>" +
//                "</ol>" +
//                "</body>" +
//                "</html>";
//    }

    @RequestMapping(value = "skills", method = RequestMethod.POST)
    public String namePage(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        String html = "<html>" +
                "<body>" +
                "<h1>Hello, " + name + "!</h1>" +
                "<h2>Your favorite programming languages are:</h2>" +
                "<table>" +
                "<tr><th>Rank</th><th>Language</th></tr>" +
                "<tr><td>1st</td><td>" + language1 + "</td></tr>" +
                "<tr><td>2nd</td><td>" + language2 + "</td></tr>" +
                "<tr><td>3rd</td><td>" + language3 + "</td></tr>" +
                "</table>" +
                "</body>" +
                "</html>";

        return html;
    }
}

