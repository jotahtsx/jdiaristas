const changeThemeBtn = document.querySelector("#change-theme");
const menu = document.querySelector(".menu");
const profile = document.querySelector(".header-user-profile");

function toggleDarkMode() {
    document.body.classList.toggle('dark');
}

function loadTheme() {
    const darkmode = localStorage.getItem("dark");

    if (darkmode) {
        toggleDarkMode();
    }
}

function closeMenuOutsideClick(event) {
    const isClickInsideMenu = menu.contains(event.target);
    const isClickInsideProfile = profile.contains(event.target);

    if (!isClickInsideMenu && !isClickInsideProfile) {
        menu.classList.remove('active');
    }
}

loadTheme();

changeThemeBtn.addEventListener("change", function () {
    toggleDarkMode();
    localStorage.removeItem("dark");

    if (document.body.classList.contains("dark")) {
        localStorage.setItem("dark", 1);
    }
});

profile.onclick = () => {
    menu.classList.toggle('active');
};

document.addEventListener('click', closeMenuOutsideClick);
