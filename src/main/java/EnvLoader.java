import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;

public class EnvLoader {
    static {
        Dotenv dotenv = Dotenv.configure()
                .directory("src/main/resources") // Ensure it matches your file location
                .ignoreIfMissing()
                .load();

        // Iterate over DotenvEntry objects and set system properties
        for (DotenvEntry entry : dotenv.entries()) {
            System.setProperty(entry.getKey(), entry.getValue());
        }
    }
}

