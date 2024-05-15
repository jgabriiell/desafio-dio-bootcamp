package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> registeredContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp) {
        this.registeredContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.registeredContents.stream().findFirst();
        if (content.isPresent()) {
            this.completedContents.add(content.get());
            this.registeredContents.remove(content.get());
        } else {
            System.err.println("You have no content registered");
        }
    }

    public double calculateXpTotal() {
        return this.completedContents.stream()
                .mapToDouble(Content::calculateXp)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getRegisteredContents() {
        return registeredContents;
    }

    public void setRegisteredContents(Set<Content> registeredContents) {
        this.registeredContents = registeredContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getRegisteredContents(), dev.getRegisteredContents()) && Objects.equals(getCompletedContents(), dev.getCompletedContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegisteredContents(), getCompletedContents());
    }
}
