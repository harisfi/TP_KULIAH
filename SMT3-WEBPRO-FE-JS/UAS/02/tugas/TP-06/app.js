const vm = new Vue({
    el: "#app",
    data: {
        fullName: null,
        comment: null,
        color: null,
        comments: [],
        typing: null
    },
    methods: {
        createComment() {
            let scheme = ''

            if (!this.fullName) {
                scheme = 'bg-danger';
            } else if (!this.comment) {
                scheme = 'bg-warning';
            }

            this.comments.push({
                name: this.fullName ? this.fullName : 'tanpa nama',
                content: this.comment ? this.comment : 'tidak menulis komentar',
                color: this.color,
                scheme
            });
        }
    },
    computed: {
        jumlahKomen() {
            return this.comments.length + 1;
        }
    },
    watch: {
        comment(val) {
            if (val) {
                this.typing = val === 'programming' ? 'PFE' : 'sedang mengetik...';
            } else {
                this.typing = null;
            }
        }
    }
});
