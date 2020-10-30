package seedu.duke.others;

import seedu.duke.Command;
import seedu.duke.backend.UserInput;

public class CommandUpload extends Command {
    UserInput userInput;

    @Override
    public String execute() throws Exception {

        return "Upload completed successfully!"
                + "\nThe URL is: https://drive.google.com/file/d/121xF1y0aWbyHoiu80Sei787lCOf1ECgx/view?usp=sharing";
    }

    @Override
    public int validate(UserInput ui) {
        userInput = ui;
        if (ui.getCategory().equals("") && (ui.getCommand().equalsIgnoreCase("upload")
                || ui.getCommand().equalsIgnoreCase("up"))) {
            return ACCEPT;
        }
        return NO_MATCH;
    }

    @Override
    public String help() {
        return null;
    }
}
