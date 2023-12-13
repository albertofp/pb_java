package br.edu.infnet.jobhunter.model.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SavedJob extends Job{
        public Progress getProgress() {
                return progress;
        }

        public void setProgress(Progress progress) {
                this.progress = progress;
        }

        private Progress progress;
        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        public SavedJob() {
                this.progress = Progress.NotApplied;
        }
}
