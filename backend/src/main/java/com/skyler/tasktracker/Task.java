@Entity
public class Task {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private boolean completed;

    // Getters and Setters
}
